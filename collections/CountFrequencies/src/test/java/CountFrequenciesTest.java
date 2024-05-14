import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.CountFrequencies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class CountFrequenciesTest {

    @ParameterizedTest(name = "{0} -- displayCount({1}) == {2}")
    @DisplayName("displayCount test")
    @CsvSource(value = {
            "test1 :  1, 2, 2, 3, 1 : {1=2, 2=2, 3=1}",
            "test2 : 4, 4, 5, 5, 5, 6, 7, 7 : {4=2, 5=3, 6=1, 7=2}",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<Integer> param = Arrays.stream(input.split(", ")).map(Integer::parseInt).toList();

        var result = CountFrequencies.displayCount(param).toString();

        assertEquals(expected, result);
    }
}
