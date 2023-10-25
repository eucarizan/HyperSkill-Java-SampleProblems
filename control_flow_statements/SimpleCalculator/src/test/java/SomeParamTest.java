import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- solve({1} {3} {2}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithAddition : 10000000000 : 20000000000 : + : 30000000000",
            "testWithSubtraction : 30000000000 : 20000000000 : - : 10000000000",
            "testWithMultiplication : 1 : 20000000000 : * : 20000000000",
            "testWithDivision : 20000000000 : 20000000000 : / : 1",
            "testWithDivisionByZero : 3000 : 0 : / : Division by 0!",
            "testWithUnknownOperator : 10000 : 30 : ! : Unknown operator",
    }, delimiter = ':')
    public void test(String name, long n1, long n2, String param, String expected) {
        var result = Solution.solve(n1, n2, param);

        assertEquals(expected, result);
    }
}
