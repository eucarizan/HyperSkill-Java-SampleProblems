import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ListSplitSublist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class ListSplitSublistTest {

    @ParameterizedTest(name = "{0} -- splitListIntoSublists({1}) == {2}")
    @DisplayName("splitListIntoSublists test")
    @CsvSource(value = {
            "test1 : 4 : 1, 2, 3, 4, 5, 6, 7 : [[1, 2, 3, 4], [5, 6, 7]]",
            "test2 : 8 : 7, 4, 3, 2, 8, 1 : [[7, 4, 3, 2, 8, 1]]",
            "test3 : 5 : 10, 12, 12, 13, 13, 45, 12, 19, 34, 12, 588, 12, 34, 12 : [[10, 12, 12, 13, 13], [45, 12, 19, 34, 12], [588, 12, 34, 12]]",
            "test4 : 1 : 10, 12, 12, 13 : [[10], [12], [12], [13]]",
    }, delimiter = ':')
    public void test(String name, int size, String input, String expected) {
        List<Integer> param = Arrays.stream(input.split(", ")).map(Integer::parseInt).toList();

        var result = ListSplitSublist.splitListIntoSublists(param, size).toString();

        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "{0} -- splitListIntoSublists({1}) == {2}")
    @DisplayName("splitListIntoSublistsStream test")
    @CsvSource(value = {
            "test1 : 4 : 1, 2, 3, 4, 5, 6, 7 : [[1, 2, 3, 4], [5, 6, 7]]",
            "test2 : 8 : 7, 4, 3, 2, 8, 1 : [[7, 4, 3, 2, 8, 1]]",
            "test3 : 5 : 10, 12, 12, 13, 13, 45, 12, 19, 34, 12, 588, 12, 34, 12 : [[10, 12, 12, 13, 13], [45, 12, 19, 34, 12], [588, 12, 34, 12]]",
            "test4 : 1 : 10, 12, 12, 13 : [[10], [12], [12], [13]]",
    }, delimiter = ':')
    public void test2(String name, int size, String input, String expected) {
        List<Integer> param = Arrays.stream(input.split(", ")).map(Integer::parseInt).toList();

        var result = ListSplitSublist.splitLIstIntoSublistsStream(param, size).toString();

        assertEquals(expected, result);
    }
}
