import java.util.function.Function;
import java.util.function.Predicate;

public class Solution {
    public static boolean method(int num1, int num2, int num3) {
        return (num1 > 0 && num2 <= 0 && num3 <= 0) || (num1 <= 0 && num2 > 0 && num3 <= 0) || (num1 <= 0 && num2 <= 0 && num3 > 0);
    }

    public static boolean bestRated(int num1, int num2, int num3) {
        Function<Integer, Integer> isPositive = num -> num > 0 ? 1 : 0;
        int n1 = isPositive.apply(num1);
        int n2 = isPositive.apply(num2);
        int n3 = isPositive.apply(num3);
        return n1 + n2 + n3 == 1;
    }
}
