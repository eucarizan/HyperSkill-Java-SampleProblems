public class Option {
    private final int amount;

    Option(int amount) {
        this.amount = amount;
    }

    String buy() {
        return amount + " was bought";
    }

    String sell() {
        return amount + " was sold";
    }
}
