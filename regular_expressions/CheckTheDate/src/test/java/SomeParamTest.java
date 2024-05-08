import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- matchesDate({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testValidDateFormat1.1 : 2000-12-31 : Yes",
            "testValidDateFormat1.2 : 1975-01-15 : Yes",
            "testValidDateFormat2.1 : 31-12-2000 : Yes",
            "testValidDateFormat2.2 : 15-01-1975 : Yes",
            "testValidDateFormatWithDots1.1 : 2000.12.31 : Yes",
            "testValidDateFormatWithDots1.2 : 31.12.2000 : Yes",
            "testValidDateFormatWithSlashes1.1 : 2000/12/31 : Yes",
            "testValidDateFormatWithSlashes1.2 : 31/12/2000 : Yes",
            // "testInvalidDateFormat.1.1 : 2022-02-30 : No",
            "testInvalidDateFormat.1.1 : 1975-13-15 : No",
            // "testInvalidDateFormat.1.3 : 2022/02/30 : No",
            "testInvalidDateFormat.1.2 : 15-13-1975 : No",
            "testInvalidDateFormat.1.3 : abcd-ef-gh : No",
            "testInvalidDate : 1999/00/00 : No",
            "testInvalidDate : 32.12.2023 : No",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = Date.checkDate(param);

        assertEquals(expected, result);
    }
}
