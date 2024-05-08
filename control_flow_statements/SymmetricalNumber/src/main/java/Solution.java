public class Solution {
    public static int reverse(int num) {
        int n = 0;
        final int ten = 10;

        while (num > 0) {
            int rem = num % ten;
            n = (n * ten) + rem;
            num /= ten;
        }

        return n;
    }
}
