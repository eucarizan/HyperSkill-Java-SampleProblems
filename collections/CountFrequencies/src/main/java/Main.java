import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 2, 3, 1);
        Map<Integer, Long> map = nums
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map
                .toString()
                .replace("=", ": ")
                .replace(", ", "\n")
                .replaceAll("[{}]", "")
        );
    }
}