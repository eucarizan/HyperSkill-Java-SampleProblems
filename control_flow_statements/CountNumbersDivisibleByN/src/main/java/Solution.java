public class Solution {
    public static int count(int a, int b, int n) {
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }

        return count;
    }
}
