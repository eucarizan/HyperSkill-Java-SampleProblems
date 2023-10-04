import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- unaryOperator({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZero : 0 : 30.0",
            "testWithPositive : 1 : 60.0",
            "testWithNegative : -2 : 30.0",
    }, delimiter = ':')
    public void test(String name, int input, double expected) {
        double result = Solution.unaryOperator.applyAsDouble(input);

        assertEquals(expected, result, 0.0001);
    }
}
