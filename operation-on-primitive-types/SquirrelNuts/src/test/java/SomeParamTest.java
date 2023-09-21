import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- nutsForEach({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithNoNuts : 3 : 0 : 0",
            "testWithNoSquirrel : 0 : 14 : 0",
            "testWithPositiveValues : 3 : 14 : 4",
            "testWithUnevenDistribution : 3 : 19 : 6",
            "testWithZeroNutsAndSquirrels : 0 : 0 : 0",
            "testWithLargeValues : 100 : 1000 : 10",
    }, delimiter = ':')
    public void test(String name, int squirrels, int nuts, int expected) {
        int result = Squirrel.nutsForEach(squirrels, nuts);

        assertEquals(expected, result);
    }
}
