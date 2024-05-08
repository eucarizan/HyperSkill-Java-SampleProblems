public class TimeDifference {
    static final int SIXTY = 60;
    public static int getDifference(int hour1, int min1, int sec1, int hour2, int min2, int sec2) {
        return getTime(hour2, min2, sec2) - getTime(hour1, min1, sec1);
    }

    private static int getTime(int hour, int min, int sec) {
        return hour * SIXTY * SIXTY + min * SIXTY + sec;
    }
}
