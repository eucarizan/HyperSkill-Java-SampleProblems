public class Numbers {
    static final int TEN = 10;
    public static int reverse(int threeDigitNumber) {
        if (String.valueOf(threeDigitNumber).length() < 3) {
            return 0;
        }

        int hundreds = threeDigitNumber / (TEN * TEN);
        int tens = threeDigitNumber / TEN % TEN;
        int ones = threeDigitNumber % TEN;

        return ones * TEN * TEN + tens * TEN + hundreds;
    }
}
