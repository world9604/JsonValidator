package device.apps.jsonvalidator.validator.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class FlatMapUtil {

    private FlatMapUtil() {
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
}
