public class Solution {
    public static boolean isBetween(int num, int num1, int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        return num >= min && num <= max;
    }
}
