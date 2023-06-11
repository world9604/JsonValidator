package device.apps.jsonvalidator.validator;

import android.support.annotation.NonNull;
import android.util.Log;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.MessageInterpolator;
import javax.validation.Path;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import device.apps.jsonvalidator.R;
import device.apps.jsonvalidator.entity.ConfigResult;
import device.apps.jsonvalidator.validator.utils.FlatMapUtil;
import device.apps.jsonvalidator.validator.utils.ValueNodeInfoUtil;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import uk.co.jemos.podam.api.RandomDataProviderStrategy;

public class ProfileValidator {
    private boolean isLogging = false;
    public static final String TAG = "ProfileValidator";
    private static final String KEY_VALIDATION_FAILED = "Json Key Validation";
    private static final String VALUE_VALIDATION_FAILED = "Json Value Validation";
    private final String RES_AND_VALUE_SEPARATOR = "::";
    private ValidatorFactory valueNodeValidatorFactory;
    private static ProfileValidator instance;
    private Gson gson;
    private Type serializationType;

    public static ProfileValidator getInstance() {
        if (instance == null) {
            synchronized (ProfileValidator.class) {
                if (instance == null) {
                    instance = new ProfileValidator();
                }
            }
        }
        return instance;
    }

    private ProfileValidator() {
        this.gson = new Gson();
        this.serializationType = new TypeToken<Map<String, Object>>() {
        }.getType();
        this.valueNodeValidatorFactory = Validation.byDefaultProvider().configure().ignoreXmlConfiguration().messageInterpolator(new MessageInterpolator() {
            @Override
            public String interpolate(String messageTemplate, Context context) {
                if (messageTemplate.contains(RES_AND_VALUE_SEPARATOR)) {
                    String[] resArr = messageTemplate.split(RES_AND_VALUE_SEPARATOR);
                    String resName = resArr[0];
                    String allowedValues = resArr[1];
                    int id = ApplicationContext.getApplication().getResources().getIdentifier(resName, "string", R.class.getPackage().getName());
                    return ApplicationContext.getApplication().getString(id, allowedValues);
                }

                int id = ApplicationContext.getApplication().getResources().getIdentifier(messageTemplate, "string", R.class.getPackage().getName());
                return ApplicationContext.getApplication().getString(id);
            }

            @Override
            public String interpolate(String messageTemplate, Context context, Locale locale) {
                return interpolate(messageTemplate, context);
            }
        }).buildValidatorFactory();
    }

    public void setIsLogging(boolean isLogging) {
        this.isLogging = isLogging;
    }

    /**
     * @진행순서
     * 1. 위 구조는 다음과 같이 표현된다 : ("/phone_config/listPhoneConfig/0/apn_bearer/0/" -> "2ybGKvmbtP")
     * 2. 대조군 : 미리 정의된 json 키들(EmkitAgent의 모든 속성값, dummyProfile)을 위와 같은 형태로 만든다.
     * 3. 실험군 : 사용자가 작성한 json(예 : EmkitAgent.json) 키들도 위와 같은 형태로 만든다.
     * 4. 대조군, 실험군을 비교하여, 실험군에만 존재하는 키들을 찾아낸다.
     *
     * @param
     * <T> pojo : 제네릭 타입으로 원하는 pojo를 입력해도 되고, File 타입 형태가 입력된다면, json 파일로
     * 생각하고, File path로 부터 파일을 읽어와 파싱한다.
     *
     * @return
     * ConfigResult {result : "Fail", name : "Key Validation Failed", errors : ["invalid input : {잘못된 입력값}", "{기타 메세지}"]}
     * 유효성 검사를 모두 통과했다면, 길이가 0인 List<ConfigReulst>를 반환한다.
     *
     * @예시1
     * 아래 두 키는 다르다.
     * /eminstall_config/JobList/0/downloadUrl
     * /eminstall_config/JobList/0/download
     *
     * @예시2
     * 아래 두 키는 다르다.
     * /eminstall_config/JobList/0/downloadUrl
     * /gmsPackage_config/gmspackage_info/0/downloadUrl
     *
     * @예시3
     * 아래 두 키는 다르다.
     * /eminstall_config/JobList/0/extraStr/0
     * /eminstall_config/JobList/0/extraStr/1
     * 배열의 경우, 배열의 갯수가 다르면 다른 키로 인식한다.
     * 더미 데이터 중, 배열의 더미 갯수가 더 많으면, 정확히 검사한다.
     * 따라서, 더미 데이터의 @PodamCollection(nbrElements = 3)
     * 어노테이션으로 최대 길이를 입력하여 예방 가능하다.
     * 또는, @FirstElementPattern을 사용했다면, @PodamCollection(nbrElements = 2)을 넣어줘야, 키 검사를 정확히 한다.
     *
     * @예시4
     * /z"button_config"/btn_app_switch
     * 위와 같이 key name의 큰따음표 밖에 오타가 있는 경우도 잡아낸다.
     *
     * @예시5
     * /eminstall_config/JobList/0/extraStr/0
     * /eminstall_config/jobList/0/extraStr/0
     * 대소문자를 구분한다.
     *
     * @용어
     * - dummyProfile : entity 패키지 > java pojo로 부터 만들어낸 json 구조의 더미 데이터를 의미한다.
     * - Container Node : json(tree)구조에서 leaf 노드가 아닌 노드를 의미한다.
     * - Value Node : json(tree)구조에서 leaf 노드를 의미한다.
     * - userProfile : 예를들어, EmkitAgent.json 같은것들이다.
     */
    public <T, G> List<ConfigResult> validateContainerNode(T pojo, Class<G> clazz) {
        List<ConfigResult> results = new ArrayList<>();
        try {
            results = validateContainerNodeInProfile(pojo, clazz);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            addException(results, e);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            addException(results, e);
        } catch (Exception e) {
            e.printStackTrace();
            addException(results, e);
        }
        return results;
    }

    private void addException(List<ConfigResult> results, Exception e) {
        ConfigResult result = new ConfigResult(e.getClass().getSimpleName());
        result.addError(e.getMessage());
        results.add(result);
    }

    private <T,G> List<ConfigResult> validateContainerNodeInProfile(T pojo, Class<G> clazz) throws FileNotFoundException {
        Map<String, Object> userProfileFlatMap = getUserProfile(pojo);
        Map<String, Object> dummyProfileAsFlatMap = getDummyProfileFromPojo(clazz);
        MapDifference<String, Object> difference = Maps.difference(userProfileFlatMap, dummyProfileAsFlatMap);
        Map<String, Object> diff = difference.entriesOnlyOnLeft();
        List<ConfigResult> results = new ArrayList<>();
        for (String invalidKey : diff.keySet()) {
            ConfigResult result = new ConfigResult(KEY_VALIDATION_FAILED);
            result.addError("invalid input : " + invalidKey);
            results.add(result);
        }
        printLog("Json Key Validation", results);
        return results;
    }

    @NonNull
    private <T> Map<String, Object> getUserProfile(T pojo) throws FileNotFoundException{
        Map<String, Object> userProfileMap;

        if(pojo instanceof File) {
            FileReader fReader = new FileReader((File) pojo);
            userProfileMap = gson.fromJson(gson.newJsonReader(fReader), serializationType);
        } else {
            String userProfileStr = gson.toJson(pojo);
            userProfileMap = gson.fromJson(userProfileStr, serializationType);
        }
        return FlatMapUtil.flatten(userProfileMap);
    }

    //java pojo → json 형태의 트리구조의 더미 데이터를 만든다.
    private <T> Map<String, Object> getDummyProfileFromPojo(Class<T> clazz) {
        String dummyProfileAsJson = getDummyProfileJson(clazz);
        Map<String, Object> dummyProfileAsMap = gson.fromJson(dummyProfileAsJson, serializationType);
        return FlatMapUtil.flatten(dummyProfileAsMap);
    }

    private <T> String getDummyProfileJson(Class<T> clazz) {
        PodamFactory factory = new PodamFactoryImpl();
        RandomDataProviderStrategy strategy = (RandomDataProviderStrategy) factory.getStrategy();
        strategy.setDefaultNumberOfCollectionElements(1);
        //factory.getStrategy().setMemoization(false);
        T myPojo = factory.manufacturePojo(clazz);
        String json = gson.toJson(myPojo);
        //writeAsFile(json);
        return json;
    }

    /**
     * @진행순서
     * JSON에서 Value Node의 유효성 검사를 진행함.
     * 입력된 pojo들의 필드 값에 대해서 정규표현식을 검사한다.
     *
     * @사용법
     * - @Pattern : regexp 속성에 정규표현식을 입력, 이 어노테이션을 사용했다면 @PodamStringValue을 입력 해야한다.
     * - @FirstElementPattern : pojo의 필드가 List 형태라면, 첫번째 요소의 대해서만 정규표현식을 검사한다.
     * - @FirstElementPattern을 사용했다면, @PodamCollection(nbrElements = 2)을 넣어줘야, 키 검사를 정확히 한다.
     * - @Valid : 이 어노테이션을 사용하여 String 이외에 Reference type에 대하여 유효성 검사를 보장한다.
     *
     * @return
     * ConfigReulst {result : "Fail", name : "Value Validation Failed", errors : ["key name : {key name}", "invalid input : {잘못된 입력값}", "{유효한 옵션 목록}", "{유효한 정규표현식}", "{기타 메세지}"]}
     * 유효성 검사를 모두 통과했다면, 길이가 0인 List<ConfigReulst>를 반환한다.
     *
     * @용어
     * - dummyProfile : entity 패키지 > java pojo로 부터 만들어낸 json 구조의 더미 데이터를 의미한다.
     * - Container Node : json(tree)구조에서 leaf 노드가 아닌 노드를 의미한다.
     * - Value Node : json(tree)구조에서 leaf 노드를 의미한다.
     * - userProfile : 예를들어, EmkitAgent.json 같은것들이다.
     */
    public <T> List<ConfigResult> validateValueNode(T pojo) {
        List<ConfigResult> results = new ArrayList<>();
        try {
            return validateValueNodeInProfile(pojo);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            addException(results, e);
        } catch (Exception e) {
            e.printStackTrace();
            addException(results, e);
        }
        return results;
    }

    public <T> List<ConfigResult> validateValueNode(File pojoFile, Class clazz) {
        List<ConfigResult> results = new ArrayList<>();
        try {
            FileReader fReader = new FileReader(pojoFile);
            Object pojo = gson.fromJson(gson.newJsonReader(fReader), clazz);
            return validateValueNodeInProfile(pojo);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            addException(results, e);
        } catch (Exception e) {
            e.printStackTrace();
            addException(results, e);
        }
        return results;
    }

    @NonNull
    private <T> List<ConfigResult> validateValueNodeInProfile(T userProfile) {
        List<ConfigResult> results = new ArrayList<>();
        if (userProfile == null) return results;
        Validator validator = this.valueNodeValidatorFactory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(userProfile);
        for (ConstraintViolation<T> violation : violations) {
            String keyName = getSerializedName(violation);
            String invalidValue = violation.getInvalidValue().toString();
            String validOptions = violation.getMessage();
            String regExpStr = "";
            Object regExp = violation.getConstraintDescriptor().getAttributes().get("regexp");
            if (regExp != null) regExpStr = String.valueOf(regExp);
            ConfigResult result = new ConfigResult(VALUE_VALIDATION_FAILED);
            result.addError("key name : " + keyName);
            result.addError("invalid input : " + invalidValue);
            result.addError("valid options : " + validOptions);
            result.addError("valid regular expression : " + regExpStr);
            results.add(result);
        }
        printLog("Json Value Validation", results);
        return results;
    }

    //pojo field(ConstraintViolation.propertyPath) -> gson @Expose 변경하여 출력해야 한다.
    private <T> String getSerializedName(ConstraintViolation<T> violation) {
        String sName = violation.getPropertyPath().toString();
        try {
            Iterator<Path.Node> iterator = violation.getPropertyPath().iterator();
            while (iterator.hasNext()) {
                Path.Node node = iterator.next();
                if (!iterator.hasNext()) {
                    Field field = violation.getLeafBean().getClass().getDeclaredField(node.getName());
                    sName = field.getAnnotation(SerializedName.class).value();
                    return sName;
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return sName;
    }

    private <T> void printLog(String title, List<ConfigResult> results) {
        if (!isLogging) return;
        Log.i(TAG, "-------------------[START]" + title + "-------------------------------");
        for (ConfigResult result : results) {
            Log.i(TAG, "result : " + result.getResult());
            Log.i(TAG, "name : " + result.getName());
            for (String error : result.getErrors()) Log.i(TAG, error);
        }
        Log.i(TAG, "-------------------[END]" + title + "---------------------------------");
    }

    public <T> Map<String, Object> findConstraints(Class<T> clazz) {
        Map<String, Object> result = new HashMap<>();
        try {
            PodamFactory factory = new PodamFactoryImpl();
            RandomDataProviderStrategy strategy = (RandomDataProviderStrategy) factory.getStrategy();
            strategy.setDefaultNumberOfCollectionElements(1);
            //factory.getStrategy().setMemoization(false);
            T myPojo = factory.manufacturePojo(clazz);
            result = ValueNodeInfoUtil.getPatternInfo(myPojo);
            //writeAsFile(gson.toJson(result));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private void writeAsFile(String data) {
        String jsonPath = "/storage/emulated/0/";
        FileWriter fWriter;
        File file = new File(jsonPath + "dummy_data.json");
        try {
            fWriter = new FileWriter(file);
            fWriter.write(data);
            fWriter.flush();
            fWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}