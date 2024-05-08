import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- zeroOrGreaterThan1k({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithSumGreaterThan1000 : 800, 101, 102, 300, 0 : 3",
            "testWithEncountersZero : 103, 105, 109, 0, 1000 : 317",
            "testWithAllZero : 0, 0, 0, 0 : 0",
            "testWithSingleNumber : 500 : 500",
            "testWithSingleNumberNotExceedingLimit : 1000 : 1000",
            "testWithSingleNumberExceedingLimit : 1100 : 100",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Solution.zeroOrGreaterThan1k(param);

        assertEquals(expected, result);
    }
}
