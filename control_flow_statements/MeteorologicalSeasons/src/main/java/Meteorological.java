public class Meteorological {
    public static int season(String seasonStr) {
        try {
            Seasons season = Seasons.valueOf(seasonStr);
            return switch (season) {
                case SPRING, AUTUMN -> 20;
                case SUMMER -> 37;
                case WINTER -> 1;
            };
        } catch (IllegalArgumentException e) {
            return 0;
        }
    }
}
