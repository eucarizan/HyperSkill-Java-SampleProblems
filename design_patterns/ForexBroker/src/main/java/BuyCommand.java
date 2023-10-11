public class BuyCommand implements Command {
    private final Option option;

    BuyCommand(Option option) {
        this.option = option;
    }

    @Override
    public String execute() {
        return option.buy();
    }
}
