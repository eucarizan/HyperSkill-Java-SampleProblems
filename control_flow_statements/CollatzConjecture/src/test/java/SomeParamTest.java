import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- collatzSequence({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithEven : 6 : [6, 3, 10, 5, 16, 8, 4, 2, 1]",
            "testWithOdd : 17 : [17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1]",
            "testWithOne : 1 : [1]"
    }, delimiter = ':')
    public void test(String name, int param, String expected) {
        var result = Solution.collatzSequence(param).toString();

        assertEquals(expected, result);
    }
}
