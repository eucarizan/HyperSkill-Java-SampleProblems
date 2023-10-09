import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                ConcatPositiveNumbersProblem
                        .concatPositiveNumbers(
                                new ArrayList<>(List.of(8, 11, -2, -3, 14, 15)),
                                new ArrayList<>(List.of(-1, 33, 12, -3, -5))));
    }
}