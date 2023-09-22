public class Solution {
    public static boolean method(int num1, int num2, int num3) {
        return (num1 > 0 && num2 <= 0 && num3 <= 0) || (num1 <= 0 && num2 > 0 && num3 <= 0) || (num1 <= 0 && num2 <= 0 && num3 > 0);
    }
}
