import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.StringArraySort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class StringArraySortTest {

    @ParameterizedTest(name = "{0} -- sortArray({1}) == {2}")
    @DisplayName("sortArray test")
    @CsvSource(value = {
            "test1 : y, d, b, u, t, f, m, h, x, q : [b, d, f, h, m, q, t, u, x, y]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        String[] param = Arrays.stream(input.split(", ")).toArray(String[]::new);

        var result = Arrays.toString(StringArraySort.sortArray(param));

        assertEquals(expected, result);
    }
}
