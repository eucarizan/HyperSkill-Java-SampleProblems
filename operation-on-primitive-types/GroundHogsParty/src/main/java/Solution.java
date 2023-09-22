public class Solution {
    public static boolean isSuccessfulParty(int butterCups, boolean isWeekend) {
        final int minWeekday = 10;
        final int maxWeekday = 20;
        final int minWeekend = 15;
        final int maxWeekend = 25;

        return !isWeekend && (butterCups >= minWeekday && butterCups <= maxWeekday)
                || isWeekend && (butterCups >= minWeekend && butterCups <= maxWeekend);
    }
}
