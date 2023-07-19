package device.apps.jsonvalidator;


import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.util.List;
import device.apps.jsonvalidator.entity.ConfigResult;
import device.apps.jsonvalidator.entity.Scan2StageEntity;
import device.apps.jsonvalidator.validator.ProfileValidator;

public class ProfileValidatorTest {

    private ProfileValidator validator;
    private File json;

    @Before
    public void init() {
        validator = ProfileValidator.getInstance();
        validator.setIsLogging(true);
    }

    @Test
    public void existingAndNonExistingKeysInArray_validateContainerNode_test_1() {
        json = new File("/storage/emulated/0/1.json");

        //{result : "Fail", name : "Json Key Validation", errors : ["invalid input : {잘못된 입력값}", "{기타 메세지}"]}
        List<ConfigResult> actual = validator.validateContainerNode(json, Scan2StageEntity.class);

        assertTrue(actual.stream().anyMatch(item -> {
            boolean passNameTest = "Json Key Validation".equals(item.getName());
            boolean passResultTest = "Fail".equals(item.getResult());
            boolean passErrorTest = false;

            for (String error : item.getErrors()) {
                if (error.equals("invalid input : /eminstall_config/JobList/jobType2")) {
                    passErrorTest = true;
                    break;
                }
                if (error.equals("invalid input : /eminstall_config/JobList/3downloadUrl")) {
                    passErrorTest = true;
                    break;
                }
            }

            System.out.println(
                    String.format("passNameTest : %s, passResultTest : %s, passErrorTest : %s",
                            passNameTest, passResultTest, passErrorTest)
            );

            return passNameTest & passResultTest & passErrorTest;
        }));
    }

    @Test
    public void caseSensitive_validateContainerNode_test_2() {
        json = new File("/storage/emulated/0/2.json");

        //{result : "Fail", name : "Json Key Validation", errors : ["invalid input : {잘못된 입력값}", "{기타 메세지}"]}
        List<ConfigResult> actual = validator.validateContainerNode(json, Scan2StageEntity.class);

        assertTrue(actual.stream().anyMatch(item -> {
            boolean passNameTest = "Json Key Validation".equals(item.getName());
            boolean passResultTest = "Fail".equals(item.getResult());
            boolean passErrorTest = false;

            for (String error : item.getErrors()) {
                if (error.equals("invalid input : /datetime_config/automatic_Time_zone")) {
                    passErrorTest = true;
                    break;
                }
            }

            System.out.println(
                    String.format("passNameTest : %s, passResultTest : %s, passErrorTest : %s",
                            passNameTest, passResultTest, passErrorTest));

            return passNameTest & passResultTest & passErrorTest;
        }));
    }

    @Test
    public void nonExistingKeysInArray_validateContainerNode_test_3() {
        json = new File("/storage/emulated/0/3.json");

        //{result : "Fail", name : "Json Key Validation", errors : ["invalid input : {잘못된 입력값}", "{기타 메세지}"]}
        List<ConfigResult> actual = validator.validateContainerNode(json, Scan2StageEntity.class);

        assertTrue(actual.stream().anyMatch(item -> {
            boolean passNameTest = "Json Key Validation".equals(item.getName());
            boolean passResultTest = "Fail".equals(item.getResult());
            boolean passErrorTest = false;

            for (String error : item.getErrors()) {
                if (error.equals("invalid input : /wlan_config/wifi_config/proxy_mode")) {
                    passErrorTest = true;
                    break;
                }
                if (error.equals("invalid input : /wlan_config/wifi_con2fig/bypassurl")) {
                    passErrorTest = true;
                    break;
                }
                if (error.equals("invalid input : /wlan_config/wifi_config/proxy_port")) {
                    passErrorTest = true;
                    break;
                }
                if (error.equals("invalid input : /wlan_config/wifi_config/proxy_ad")) {
                    passErrorTest = true;
                    break;
                }
                if (error.equals("invalid input : /gmsPackage_config/gmspackage_select_type")) {
                    passErrorTest = true;
                    break;
                }
            }

            System.out.println(
                    String.format("passNameTest : %s, passResultTest : %s, passErrorTest : %s",
                            passNameTest, passResultTest, passErrorTest));

            return passNameTest & passResultTest & passErrorTest;
        }));
    }

    @Test
    public void buttonEntity_validateContainerNode_test_4() {
        json = new File("/storage/emulated/0/4.json");

        //{result : "Fail", name : "Json Key Validation", errors : ["invalid input : {잘못된 입력값}", "{기타 메세지}"]}
        List<ConfigResult> actual = validator.validateContainerNode(json, Scan2StageEntity.class);
        assertTrue(actual.size() == 0);
    }

    @Test
    public void dateTimeEntity_validateContainerNode_test_5() {
        json = new File("/storage/emulated/0/5.json");

        //{result : "Fail", name : "Json Key Validation", errors : ["invalid input : {잘못된 입력값}", "{기타 메세지}"]}
        List<ConfigResult> actual = validator.validateContainerNode(json, Scan2StageEntity.class);
        assertTrue(actual.size() == 0);
    }

    @Test
    public void findConstraints_test_6() {
        validator.findConstraints(Scan2StageEntity.class);
    }
}
