public class Solution {
    public static boolean method(int n, int m, int k) {
        int area = m * n;
        area -= k;
        return area >= 0 && (area % m == 0 || area % n == 0);
    }
}
