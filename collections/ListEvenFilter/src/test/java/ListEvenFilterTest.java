import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ListEvenFilter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class ListEvenFilterTest {

    @ParameterizedTest(name = "{0} -- filterList({1}) == {2}")
    @DisplayName("filterList test")
    @CsvSource(value = {
            "test1 : 1, 2, 3, 4, 5, 6, 7 : [6, 4, 2]",
            "test2 : 1, 2 : [2]",
            "test3 : 7, 6, -5, -4, -3, 2, 1 : [2, -4, 6]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<Integer> param = Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .toList();

        var result = ListEvenFilter.filterList(param).toString();

        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "{0} -- filterListString({1}) == {2}")
    @DisplayName("filterListString test")
    @CsvSource(value = {
            "test1 : 1, 2, 3, 4, 5, 6, 7 : 6 4 2",
            "test2 : 1, 2 : 2",
            "test3 : 7, 6, -5, -4, -3, 2, 1 : 2 -4 6"
    }, delimiter = ':')
    public void test1(String name, String input, String expected) {
        String[] param = Arrays.stream(input.split(", "))
                .toArray(String[]::new);

        var result = ListEvenFilter.filterListIntStream(param);

        assertEquals(expected, result);
    }
}
