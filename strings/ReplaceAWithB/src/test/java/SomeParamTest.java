import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- replaceAWithB({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testEmptyString : '' : ''",
            "testSingleAString : a : b",
            "testSingleNotAString : c : c",
            "testStringWithMultipleA : aca : bcb",
            "testStringWithoutA : beer : beer",
            "testCaseSensitivity : Academy : bcbdemy"
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        String result = ReplaceStrings.bWithA(param);

        assertEquals(expected, result);
    }
}
