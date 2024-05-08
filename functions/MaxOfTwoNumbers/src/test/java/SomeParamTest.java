import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- max({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithPositive : 1 : 3 : 3",
            "testWithEqual : 0 : 0 : 0",
            "testWithNegative : -4 : -5 : -4",
    }, delimiter = ':')
    public void test(String name, int num1, int num2, int expected) {
        int result = Solution.intBinaryOperator.applyAsInt(num1, num2);

        assertEquals(expected, result);
    }
}
