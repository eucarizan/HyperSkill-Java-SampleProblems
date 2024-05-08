import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- evenOrOdd({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithSingleEven : 2 : [even]",
            "testWithSingleOdd : 1 : [odd]",
            "testWithAllEven : 2, 4, 6, 8 : [even, even, even, even]",
            "testWithAllOdd : 1, 3, 5, 7 : [odd, odd, odd, odd]",
            "testWithZero : 0 : []",
            "testWithMix : 1, 2, 3, 4 : [odd, even, odd, even]",
            "testWithZeroInMiddle : 1, 2, 0, 3, 4, 5 : [odd, even]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Solution.evenOrOdd(param).toString();

        assertEquals(expected, result);
    }
}
