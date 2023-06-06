package device.apps.jsonvalidator.validator.utils;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Pattern;

import device.apps.jsonvalidator.validator.pattern.FirstElementPattern;

public final class ValueNodeInfoUtil {

    public static final String TAG = "ValueNodeInfoUtil";
    private ValueNodeInfoUtil() {
        throw new AssertionError("No instances for you!");
    }

    public static Map<String, Object> getPatternInfo(Object o) throws NoSuchFieldException, IllegalAccessException {
        Map<String, Object> result = new HashMap<>();
        if (o == null) return result;
        Class c = o.getClass();
        for (Field f : c.getDeclaredFields()) {
            f.setAccessible(true);
            subFlatten(result, "/" + getSerializedName(f), f.get(o));
        }
        return result;
    }

    private static Map<String, Object> subFlatten(Map<String, Object> result, String path, Object o) throws IllegalAccessException {
        if (o == null || o instanceof String || o instanceof Boolean
                || o instanceof Integer || o instanceof Double || o instanceof Float) {
            return result;
        }

        if (o instanceof List) {
            List<?> subList = (List<?>) o;
            int i = 0;
            for (Object subObject : subList) {
                subFlatten(result, path + "/" + i, subObject);
                i++;
            }
        } else {
            Class c = o.getClass();
            for (Field f : c.getDeclaredFields()) {
                f.setAccessible(true);
                putResult(result, path + "/" + getSerializedName(f), f);
                subFlatten(result, path + "/" + getSerializedName(f), f.get(o));
            }
        }
        return result;
    }

    private static void putResult(Map<String, Object> result, String path, Field f) {
        Map<String, String> p = new HashMap<>();
        String regexp = "";
        if (f.getAnnotation(Pattern.class) != null) {
            regexp = f.getAnnotation(Pattern.class).regexp();

        } else if (f.getAnnotation(FirstElementPattern.class) != null) {
            regexp = f.getAnnotation(FirstElementPattern.class).pattern();
        }
        p.put("regular expression", regexp);
        result.put(path, p);
    }

    private static String getSerializedName(Field f) {
        SerializedName serializedName = f.getAnnotation(SerializedName.class);
        if (serializedName != null) {
            return serializedName.value();
        }
        return f.getName();
    }
}