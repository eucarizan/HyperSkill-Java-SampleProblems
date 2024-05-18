import dev.nj.solutions.ListCountOccurrences;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class ListCountOccurrencesTest {

    @ParameterizedTest(name = "{0} -- checkTheSameNumberOfTimes({1}, [{2}], [{3}]) == {4}")
    @DisplayName("checkTheSameNumberOfTimes test")
    @CsvSource(value = {
            "test1 : 3 : 8, 8, 3, 3, 2 : 1, 3, 3, 2 : true",
            "test2 : 3 : 9, 8, 4, 3, 2 : 1, 3, 3, 3 : false",
    }, delimiter = ':')
    public void test(String name, int num, String input1, String input2, boolean expected) {
        List<Integer> param1 = Arrays.stream(input1.split(", ")).map(Integer::parseInt).toList();
        List<Integer> param2 = Arrays.stream(input2.split(", ")).map(Integer::parseInt).toList();

        var result = ListCountOccurrences.checkTheSameNumberOfTimes(num, param1, param2);

        assertEquals(expected, result);
    }
}
