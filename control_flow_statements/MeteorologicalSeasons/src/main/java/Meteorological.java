public class Meteorological {
    public static int season(String seasonStr) {
        if (seasonStr == null) {
            return 0;
        }

        try {
            Seasons season = Seasons.valueOf(seasonStr.toUpperCase());
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
