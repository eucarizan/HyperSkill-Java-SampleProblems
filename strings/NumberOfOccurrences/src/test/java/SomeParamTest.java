import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- frequencyOfSubstring({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testFrequencyWithSingleOccurrence : ababa : aba : 1",
            "testFrequencyWithSingleOccurrenceInLongerText : hello there : there : 1",
            "testFrequencyWithMultipleOccurrences : hello yellow jello : ll : 3",
            "testFrequencyWithNoOccurrences : abcdefg : xyz : 0",
            "testFrequencyWithEmptySubstring : abcdefg : '' : 0",
            "testFrequencyWithEmptyWord : '' : xyz : 0",
    }, delimiter = ':')
    public void test(String name, String word, String subString, int expected) {
        int result = NumberOfOccurrences.frequency(word, subString);

        assertEquals(expected, result);
    }
}
