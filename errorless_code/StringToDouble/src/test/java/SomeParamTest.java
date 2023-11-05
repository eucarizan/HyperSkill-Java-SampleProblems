import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- convertStringToDouble({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testConvertValidStringToDouble : 3.14159 : 3.14159",
            "testInvalidStringToDouble : abc : 0",
            "testNullStringToDouble :  : 0",
            "testEmptyStringToDouble : '' : 0",
    }, delimiter = ':')
    public void test(String name, String param, double expected) {
        var result = Solution.convertStringToDouble(param);

        assertEquals(expected, result, 0.0001);
    }
}
