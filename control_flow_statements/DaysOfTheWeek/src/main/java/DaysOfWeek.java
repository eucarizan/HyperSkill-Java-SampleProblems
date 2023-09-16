public class DaysOfWeek {
    public static int dayValue(String seasonStr) {
        if (seasonStr == null) {
            return 0;
        }

        try {
            DaysOfTheWeek daysOfTheWeek = DaysOfTheWeek.valueOf(seasonStr);
            return switch (daysOfTheWeek) {
                case MONDAY, FRIDAY, SUNDAY -> 6;
                case TUESDAY -> 7;
                case WEDNESDAY -> 9;
                case THURSDAY, SATURDAY -> 8;
            };
        } catch (IllegalArgumentException e) {
            return 0;
        }
    }
}
