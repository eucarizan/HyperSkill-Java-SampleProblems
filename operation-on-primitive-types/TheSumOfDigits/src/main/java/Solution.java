public class Solution {
    static final int HUNDRED = 100;
    static final int TEN = 10;

    public static int method(int number) {
        int num = Math.abs(number);
        return num / HUNDRED + num / TEN % TEN + num % TEN;
    }
}
