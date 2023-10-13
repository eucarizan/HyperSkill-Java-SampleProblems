import java.util.Map;

public class Solution {
    public static int sum(Map<String, Integer> map) {
        return map.values().stream()
                .reduce(0, Integer::sum);
    }
}
