import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

@SuppressWarnings("unused")
public class BinarySearchTest {

    @ParameterizedTest(name = "{0} -- callBinarySearch({2}, [{1}]) == {3}")
    @DisplayName("callBinarySearch test")
    @CsvSource(value = {
            "test1 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 : 5 : 5",
            "test2 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 : 10 : -11",
    }, delimiter = ':')
    public void test(String name, String input, int num, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = BinarySearch.callBinarySearch(param, num);

        assertEquals(expected, result);
    }
}
