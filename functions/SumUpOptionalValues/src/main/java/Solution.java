import java.util.List;
import java.util.Optional;

public class Solution {
    public static int method(List<Optional<Integer>> list) {
        return list.stream()
                .mapToInt(num -> num.orElse(0))
                .sum();
    }
}
