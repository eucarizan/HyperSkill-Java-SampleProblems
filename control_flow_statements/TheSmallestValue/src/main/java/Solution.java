public class Solution {
    public static long method(long num) {
        long n = 1;
        long factorial = 1;

        while (factorial <= num) {
            factorial *= n++;
        }

        return --n;
    }
}
