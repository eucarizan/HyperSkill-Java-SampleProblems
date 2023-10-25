import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- willCrash({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWith1stBridgeCrash : 16 : 15, 12, 9 : Will crash on bridge 1",
            "testWith2ndBridgeCrash : 13 : 15, 12, 9 : Will crash on bridge 2",
            "testWithLastBridgeCrash : 10 : 15, 12, 9 : Will crash on bridge 3",
            "testWillNotCrash : 8 : 9, 12, 15 : Will not crash",
            "testWithHeightExact : 8 : 8 : Will crash on bridge 1",
    }, delimiter = ':')
    public void test(String name, int height, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Solution.willCrash(height, param);

        assertEquals(expected, result);
    }
}
