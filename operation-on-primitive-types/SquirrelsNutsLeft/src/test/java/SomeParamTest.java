import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- nutsLeft({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZeroSquirrels : 0 : 10 : 0",
            "testWithZeroNuts : 3 : 0 : 0",
            "testWithPositiveValues : 4 : 20 : 0",
            "testWithUnevenDistribution : 3 : 10 : 1",
            "testWithZeroNutsAndSquirrels : 0 : 0 : 0",
            "testWithLargeValues : 100 : 1001 : 1",
    }, delimiter = ':')
    public void test(String name, int squirrels, int nuts, int expected) {
        int result = Squirrel.nutsLeft(squirrels, nuts);

        assertEquals(expected, result);
    }
}
