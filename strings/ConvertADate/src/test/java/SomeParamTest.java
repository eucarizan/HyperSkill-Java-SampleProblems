import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- convertDate({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValidDate : 2023-10-27 : 10/27/2023",
            "testWithLeadingZeros : 0001-01-01 : 01/01/0001",
            "testWithZeroYear : 0000-12-31 : 12/31/0000",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = Solution.convertDate(param);

        assertEquals(expected, result);
    }
}
