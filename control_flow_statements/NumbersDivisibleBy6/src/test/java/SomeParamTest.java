import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- sumOfSixs({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithPositive : 39, 36, 21, 57, 12, 19, 6, 52, 73, 49, 44, 47 : 54",
            "testWithNoDivisibleBySix : 7, 11, 13, 17, 19 : 0",
            "testWithNegative : -12, -18, -8, -24, -7, -36, -6 : -96",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Solution.sumOfSixs(param);

        assertEquals(expected, result);
    }
}
