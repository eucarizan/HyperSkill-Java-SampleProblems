import java.util.List;

public class Solution {
    public static List<String> method(List<String> identifiers) {
        String regex = "(^[a-zA-Z][a-zA-Z0-9_]*)|(^_[^_][a-zA-Z0-9][a-zA-Z0-9_]*)";

        return identifiers.stream()
                .filter(s -> !s.matches(regex))
                .toList();
    }
}
