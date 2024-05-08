public class Solution {
    public static String generateSequence(int n) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (k == n) {
                    break;
                }
                sb.append(i).append(" ");
                k++;
            }
        }
        return sb.toString().trim();
    }
}
