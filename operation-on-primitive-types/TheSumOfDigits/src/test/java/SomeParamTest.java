import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZero : 0 : 0",
            "testWithSingleDigitNumber : 3 : 3",
            "testWithPositiveNumber : 476 : 17",
            "testWithNegativeNumber : -36 : 9",
            "testWithLargeNumber : 999 : 27",
    }, delimiter = ':')
    public void test(String name, int param, int expected) {
        var result = Solution.method(param);

        assertEquals(expected, result);
    }
}
