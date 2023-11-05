import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- createAccount({1}, {2}, {3}, {4}) == {5}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : checking : 12345 : 1000 : 10 : CheckingAccount{fee=10.0, number='12345', balance=1000}",
            "test2 : savings : 67890 : 500 : 5 : SavingsAccount{interestRate=5.0, number='67890', balance=500}",
    }, delimiter = ':')
    public void test(String name, String type, String acct, Long balance, double num, String expected) {
        var result = Solution.createAccount(type, acct, balance, num);

        assertEquals(expected, result);
    }
}
