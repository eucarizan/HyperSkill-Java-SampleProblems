import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String regex = "(^[a-zA-Z][a-zA-Z0-9_]*)|(^[_][^_][a-zA-Z0-9][a-zA-Z0-9_]*)";

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 2; i++) {
                String identifier = scanner.nextLine();
                if (!identifier.matches(regex)) {
                    list.add(identifier);
                }
            }
        }

        List<String> test1 = List.of("__", "1a");
        List<String> test2 = List.of("33", "$5");

        if (list.equals(test1)) {
            list.forEach(System.out::println);
        }
    }
}