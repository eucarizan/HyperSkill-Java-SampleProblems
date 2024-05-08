import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- highestDivisibleBy4({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithMix : 16, 49, 91, 77, 36, 12, 12, 36 : 36",
            "testAllDivisibleBy4 : 4, 8, 12, 16, 20 : 20",
            "testWithNoDivisible : 3, 7, 11, 13, 19 : -1",
            "testWithLargeNumbers : 1000, 300, 200, 5000, 2000 : 5000",
            "testWithNegative : -8, -12, -16, -24 : -8"
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Solution.highestDivisibleBy4(param);

        assertEquals(expected, result);
    }

    @Test
    void testWithEmpty() {
        int[] nums = {};
        assertEquals(-1, Solution.highestDivisibleBy4(nums));
    }
}
