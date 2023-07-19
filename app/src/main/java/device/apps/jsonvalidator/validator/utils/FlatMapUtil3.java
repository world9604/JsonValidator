package device.apps.jsonvalidator.validator.utils;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.constraints.Pattern;

import device.apps.jsonvalidator.validator.pattern.FirstElementPattern;

public final class FlatMapUtil3 {

    private FlatMapUtil3() {
        throw new AssertionError("No instances for you!");
    }

    public static Set<String> flatten(Map<String, Object> map) {
        Set<String> result = new HashSet<>();
        if (map == null) return result;
        for (Map.Entry<String, Object> subEntry : map.entrySet()) {
            String k = subEntry.getKey();
            Object v = subEntry.getValue();
            subFlatten(result, "/" + k, v);
        }
        return result;
    }

    public static Set<String> subFlatten(Set<String> result, String key, Object value) {
        if (value == null) {
            return result;
        }

        if (value instanceof List) {
            result.add(key);
            List<?> subList = (List<?>)value;
            for (Object o : subList) {
                subFlatten(result, key, o);
            }
        } else if (value instanceof Map) {
            result.add(key);
            Map<String, Object> subMap = (Map<String, Object>) value;
            for (Map.Entry<String, Object> subEntry : subMap.entrySet()) {
                String k = key + "/" + subEntry.getKey();
                Object v = subEntry.getValue();
                subFlatten(result, k, v);
            }
        } else {
            //When value instanceof String, Boolean, Double, Integer
            result.add(key);
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
