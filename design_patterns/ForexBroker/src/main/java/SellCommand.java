public class SellCommand implements Command {
    private final Option option;

    SellCommand(Option option) {
        this.option = option;
    }

    @Override
    public String execute() {
        return option.sell();
    }
}
