import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- doubleChars({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithRegularString : Hello : HHeelllloo",
            "testWithEmptyString : '' : ''",
            "testWithSpecialCharacters : !@#$%^&*() : !!@@##$$%%^^&&**(())",
            "testWithNumbers : 12345 : 1122334455",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = Solution.doubleChars(param);

        assertEquals(expected, result);
    }
}
