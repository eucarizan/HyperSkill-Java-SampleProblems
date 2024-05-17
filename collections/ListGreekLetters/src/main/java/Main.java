import dev.nj.solutions.GreekLetter;
import dev.nj.solutions.ListGreekLetters;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GreekLetter> list = List.of(
                new GreekLetter("Gamma", 3),
                new GreekLetter("Omega", 24),
                new GreekLetter("Alpha", 1)
        );

        System.out.println(ListGreekLetters.printLetters(list));
    }
}