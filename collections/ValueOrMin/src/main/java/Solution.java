import java.util.Map;

public class Solution {
    public static int getOrMin(Map<String, Integer> map, String key) {
        return map.getOrDefault(key, map.values().stream().min(Integer::compareTo).orElse(0));
    }
}
