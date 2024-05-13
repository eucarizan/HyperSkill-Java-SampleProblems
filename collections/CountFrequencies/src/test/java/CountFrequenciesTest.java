import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.CountFrequencies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class CountFrequenciesTest {

    @ParameterizedTest(name = "{0} -- displayCount({1}, [{2}]) == {3}")
    @DisplayName("displayCount test")
    @CsvSource(value = {
            "test1 : 5 : 1, 2, 2, 3, 1 : [2]",
            "test2 : 3 : [4]",
    }, delimiter = ':')
    public void test(String name, String input param, int expected) {
        List<String> param = Arrays.stream(input.split(", ")).toList();

        var result = CountFrequencies.displayCount(param);

        assertEquals(expected, result);
    }
}
