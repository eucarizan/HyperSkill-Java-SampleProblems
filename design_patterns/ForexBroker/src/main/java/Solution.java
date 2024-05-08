import java.util.List;

public class Solution {
    public static List<String> method(List<Integer> nums) {
        Broker broker = new Broker();

        return nums.stream()
                .map(n -> {
                    Option option = new Option(n);
                    Command command;
                    if (n > 0) {
                        command = new BuyCommand(option);
                    } else {
                        command = new SellCommand(option);
                    }
                    broker.setCommand(command);
                    return broker.executeCommand();
                })
                .toList();
    }
}
