import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- reverseThreeDigitNumber({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithThreeDigitNumber : 123 : 321",
            "testWithSingleDigitNumber : 7 : 0",
            "testWithDoubleDigitNumber : 45 : 0",
            "testWithNegativeNumber : -789 : -987",
            "testWithZero : 0 : 0",
    }, delimiter = ':')
    public void test(String name, int param, int expected) {
        int result = Numbers.reverse(param);

        assertEquals(expected, result);
    }
}
