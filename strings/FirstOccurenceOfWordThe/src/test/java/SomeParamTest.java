import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- firstOccurrence({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testStartOfSentence : The apple is red. : 0",
            "testMiddleOfSentence : I ate the red apple : 6",
            "testNotExisting : I love apples : -1",
            "testEmptyString : '' : -1",
            "testMultipleOccurrence : The the the : 0",
            "testCaseSensitivity : I want THE award : 7",
    }, delimiter = ':')
    public void test(String name, String param, int expected) {
        int result = WordThe.firstOccurrence(param);

        assertEquals(expected, result);
    }
}
