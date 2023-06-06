package device.apps.jsonvalidator.validator.utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class FlatMapUtil {

    private FlatMapUtil() {
        throw new AssertionError("No instances for you!");
    }

    public static LinkedHashMap<String, Object> flatten(Map<String, Object> map) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<>();
        if (map == null) return result;
        for (Map.Entry<String, Object> subEntry : map.entrySet()) {
            String k = subEntry.getKey();
            Object v = subEntry.getValue();
            subFlatten(result, "/" + k, v);
        }
        return result;
    }

    private static Map<String, Object> subFlatten(Map<String, Object> result, String key, Object value) {
        if (value == null) {
            return result;
        }

        if (value instanceof List) {
            result.put(key, value);
            List<?> subList = (List<?>)value;
            int i = 0;
            for (Object o : subList) {
                subFlatten(result, key + "/" + i, subList.get(i));
                i++;
            }
        } else if (value instanceof Map) {
            result.put(key, value);
            Map<String, Object> subMap = (Map<String, Object>) value;
            for (Map.Entry<String, Object> subEntry : subMap.entrySet()) {
                String k = key + "/" + subEntry.getKey();
                Object v = subEntry.getValue();
                subFlatten(result, k, v);
            }
        } else {
            //When value instanceof String, Boolean, Double, Integer
            result.put(key, value);
        }

        return result;
    }
}
