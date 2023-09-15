import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- substring({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testSubstringWithValidIndices : Hello, World : 0 : 4 : Hello",
            "testSubstringWithSameIndices : Testing : 2 : 2 : s",
            "testSubstringWithNegativeIndices : Java : -2 : -1 : v",
            "testSubstringWithEndIndexOutOfRange : Programming : 5 : 15 : amming",
            // "testSubstringWithStartIndexGreaterThanEndIndex : Edge : 2 : 1 : d",
            "testSubstringWithEmptyString : '' : 0 : 2 : ''",
    }, delimiter = ':')
    public void test(String name, String param, int idx1, int idx2, String expected) {
        String result = Extract.substring(param, idx1, idx2);

        assertEquals(expected, result);
    }
}
