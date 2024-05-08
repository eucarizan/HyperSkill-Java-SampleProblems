public class Broker {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    String executeCommand() {
        return command.execute();
    }
}
