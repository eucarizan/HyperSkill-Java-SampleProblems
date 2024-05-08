import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static Map<Integer, String> method(Map<Integer, String> map, int from, int to) {
        return map.entrySet()
                .stream().filter(e -> e.getKey() >= from && e.getKey() <= to)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}

/*
Solution for hyperskill problem
IntStream.iterate(1, n -> n + 1)
    .limit(limit)
    .mapToObj(i -> scanner.nextLine())
    .map(s -> s.split(" "))
    .collect(Collectors.toMap(p -> Integer.parseInt(p[0]), p -> p[1]))
    .entrySet().stream()
    .filter(e -> e.getKey() >= from && e.getKey() <= to)
    .forEach(e -> System.out.printf("%d %s%n", e.getKey(), e.getValue()));
 */
