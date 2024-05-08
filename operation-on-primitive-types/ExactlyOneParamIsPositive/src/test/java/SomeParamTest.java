import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZeroes : 0 : 0 : 0 : false",
            "testWithOnePositiveNumber : 1 : 0 : -1 : true",
            "testWithAllPositive : 1 : 10 : 21 : false",
            "testWithAllNegative : -1 : -10 : -21 : false",
            "testWithZeroAndPositive : 1 : 0 : 21 : false",
    }, delimiter = ':')
    public void test(String name, int num1, int num2, int num3, boolean expected) {
        boolean result = Solution.method(num1, num2, num3);

        assertEquals(expected, result);
    }
}
