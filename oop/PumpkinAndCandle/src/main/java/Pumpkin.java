public class Pumpkin {
    private static boolean forHalloween;

    public Pumpkin(boolean forHalloween) {
        Pumpkin.forHalloween = forHalloween;
    }

    public String addCandle() {
        if (forHalloween) {
            return new Candle().burning();
        }
        return "We don't need a candle";
    }

    static class Candle {
        String burning() {
            return "The candle is burning! Boooooo!";
        }
    }
}
