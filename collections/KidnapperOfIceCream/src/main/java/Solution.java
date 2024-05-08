import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static String method(Map<String, Long> words, List<String> notes) {
        List<String> returnList = new ArrayList<>();

        notes.forEach(s -> {
            if (words.containsKey(s) && words.get(s) > 0) {
                words.put(s, words.get(s) - 1);
                returnList.add(s);
            }
        });

        return returnList.equals(notes) ? "You get money" : "You are busted";
    }

    public static String bestRatedMethod(List<String> words, List<String> notes) {
        HashMap<String, Integer> map = new HashMap<>();
        words.forEach(s -> map.merge(s, 1, Integer::sum));
        notes.forEach(s -> map.merge(s, -1, Integer::sum));

        return map.values().stream().anyMatch(s -> s < 0) ? "You are busted" : "You get money";
    }
}
