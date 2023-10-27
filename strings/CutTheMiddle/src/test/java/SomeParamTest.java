import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- removeMiddle({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithOddLength : abcde : abde",
            "testWithEvenLength : abcd : ad",
            "testWithSingleChar : a : ''",
            "testWithEmptyString : '' : ''",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = Solution.removeMiddle(param);

        assertEquals(expected, result);
    }
}
