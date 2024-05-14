import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> numbers = List.of("387-968-2999", "505-468-5235", "739-738-3272");
        List<String> blacklist = List.of("505-468-5235");

        numbers.stream()
                .filter(e -> !blacklist.contains(e))
                .forEach(System.out::println);
    }
}