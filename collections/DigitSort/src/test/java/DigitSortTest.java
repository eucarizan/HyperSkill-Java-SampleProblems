import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.DigitSort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class DigitSortTest {

    @ParameterizedTest(name = "{0} -- convertToList({1}) == {2}")
    @DisplayName("convert to list test")
    @CsvSource(value = {
            "test1 : 1234 : [1, 2, 3, 4]",
            "test2 : 4321 : [1, 2, 3, 4]",
    }, delimiter = ':')
    public void test(String name, int input, String expected) {
        var result = DigitSort.convertToList(input).toString();

        assertEquals(expected, result);
    }
}
