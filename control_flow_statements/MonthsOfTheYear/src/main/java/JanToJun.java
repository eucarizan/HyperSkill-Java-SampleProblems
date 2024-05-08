public class JanToJun {
    static final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6;
    public static String getMonth(int monthNum) {
        return switch (monthNum) {
            case JAN -> "January";
            case FEB -> "February";
            case MAR -> "March";
            case APR -> "April";
            case MAY -> "May";
            case JUN -> "June";
            default -> "error!";
        };
    }
}
