import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- bankMgt(Account({1}), {2}, {3}) == [{4}, {5}]")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithDepositValid : 1000 : deposit : 2000 : true : Successful operation.",
            "testWithWithdrawOverBalance : 2000 : withdraw : 5000 : false : Not enough money to withdraw.",
    }, delimiter = ':')
    public void test(String name, Long balance, String operationStr, Long amount, String expected, String error) {
        Account account = new Account(balance);
        Operation operation = switch (operationStr.toUpperCase()) {
            case "DEPOSIT" -> Operation.DEPOSIT;
            case "WITHDRAW" -> Operation.WITHDRAW;
            default -> null;
        };

        assert operation != null;
        String[] result = Solution.changeBalance(account, operation, amount);

        assertEquals(expected, result[0]);
        assertEquals(error, result[1]);
    }
}
