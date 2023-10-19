import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- getMax({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid : 3, 6, 8, 0 : 8",
            "testWithZeroAtBeginning : 0, 4, 8, 12, 16, 20 : 0",
            "testWithNegative : -8, -12, -16, -24, 0 : -8",
            "testWithLargeNumbers : 1000, 300, 200, 5000, 2000, 0 : 5000",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Solution.getMax(param);

        assertEquals(expected, result);
    }
}
