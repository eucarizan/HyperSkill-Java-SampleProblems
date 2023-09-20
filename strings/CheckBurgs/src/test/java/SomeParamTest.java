import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- endsWithBurg({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testEmptyString : '' : false",
            "testNoBerg : ice : false",
            "testWordBerg : berg : true",
            "testWordEndsWithBerg : iceberg : true",
            "testWordStartsWithBerg : saintberg peter : false",
            "testCaseSensitivity : BERG : true",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        boolean result = CheckString.endsWithBurg(param);

        assertEquals(expected, result);
    }
}
