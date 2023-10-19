import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- chocolate({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid : 4 : 2 : 6 : YES",
            "testWithInvalid : 2 : 10 : 7 : NO",
            "testWithExact : 7 : 4 : 21 : YES",
            "testWithKGreaterThanArea : 1 : 7 : 99 : NO",
            "testWithNegative : -1 : 1 : 1 : NO",
    }, delimiter = ':')
    public void test(String name, int n, int m, int k, String expected) {
        var result = Solution.method(n, m, k) ? "YES" : "NO";

        assertEquals(expected, result);
    }
}
