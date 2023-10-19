public class Solution {
    public static boolean isLeapYear(int year) {
        final int n100 = 100;
        final int n400 = 400;
        final int n4 = 4;
        boolean divisibleBy4 = year % n4 == 0;
        boolean divisibleBy100 = year % n100 == 0;
        boolean divisibleBy400 = year % n400 == 0;

        return divisibleBy4 && !divisibleBy100 || divisibleBy400;
    }
}
