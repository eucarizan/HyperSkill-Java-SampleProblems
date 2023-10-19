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
            "testWithPositive : 7 : YES",
            "testWithNegative : -8 : NO",
            "testWithZero : 0 : NO",
    }, delimiter = ':')
    public void test(String name, int input, String expected) {
        var result = Solution.isPositive(input) ? "YES" : "NO";

        assertEquals(expected, result);
    }
}
