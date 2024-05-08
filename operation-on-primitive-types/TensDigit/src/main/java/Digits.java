public class Digits {
    static final int HUNDRED = 100;
    static final int TEN = 10;
    public static int tens(int number) {
        return Math.abs(number % HUNDRED / TEN);
    }
}
