import java.util.stream.IntStream;

public class Solution {
    public static long productFromAToB(long a, long b) {
        long prod = 1L;

        for (long i = a; i < b; i++) {
            prod *= i;
        }

        return prod;
    }

    public static long productStream(long a, long b) {
        return IntStream.range((int) a, (int) b).reduce(1, (prod, next) -> prod * next);
    }
}
