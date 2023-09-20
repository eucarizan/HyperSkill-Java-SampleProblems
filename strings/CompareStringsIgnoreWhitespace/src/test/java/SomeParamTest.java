import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- isEquals({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testEmptyStrings : '' : '' : true",
            "testSingleCharacterNotEqual : a : b : false",
            "testSingleCharacterEqual : a : a : true",
            "testStringWithWhitespaceAndEqual : string : str ing : true",
            "testStringWithWhitespaceAndNotEqual : string : my string : false"
    }, delimiter = ':')
    public void test(String name, String input1, String input2, boolean expected) {
        boolean result = CompareStrings.isEquals(input1, input2);

        assertEquals(expected, result);
    }
}
