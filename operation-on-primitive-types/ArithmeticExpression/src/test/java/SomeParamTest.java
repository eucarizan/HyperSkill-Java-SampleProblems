import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- solveArithmeticExpression({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZero : 0 : 6",
            "testWithPositiveNumber : 1 : 24",
            "testWithNegativeNumber : -3 : 0",
            "testWithLargeNumber : 100 : 1061106",
            "testWithIntegerLimit : 1288 : 2146687710",
    }, delimiter = ':')
    public void test(String name, int param, int expected) {
        int result = ArithmeticExpression.solve(param);

        assertEquals(expected, result);
    }
}
