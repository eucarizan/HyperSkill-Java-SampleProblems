import java.util.Map;

public class Solution {
    public static String mapShare(Map<String, String> map) {
        map.put("b", map.getOrDefault("a", map.get("b")));
        map.remove("c");
        return map.toString();
    }
}
