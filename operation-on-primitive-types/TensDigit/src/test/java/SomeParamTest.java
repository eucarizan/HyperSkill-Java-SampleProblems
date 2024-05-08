import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZero : 0 : 0",
            "testWithDoubleDigits : 47 : 4",
            "testWithTripleDigitNumber : 173 : 7",
            "testWithNegativeValue : -255 : 5",
            "testWithLargeNumber : 987654321 : 2"
    }, delimiter = ':')
    public void test(String name, int param, int expected) {
        int result = Digits.tens(param);

        assertEquals(expected, result);
    }
}
