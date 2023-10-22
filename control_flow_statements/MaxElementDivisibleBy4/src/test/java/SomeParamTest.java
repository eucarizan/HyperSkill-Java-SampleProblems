import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithPositive : 12, 78, 30, 36, 9, 16, 36, 45, 82, 96, 36 : 96",
            "testWithNegative : -12, -18, -8, -24, -7, -36, -6 : -8",
            "testWithNoDivisibleBy4 : 7, 11, 13, 17, 19 : -1",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Solution.maxByDivisibleBy4(param);

        assertEquals(expected, result);
    }
}
