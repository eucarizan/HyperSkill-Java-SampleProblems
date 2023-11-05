import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- inverseFlags({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithAllTrue : true, true, true : [false, false, false]",
            "testWithAllFalse : false, false, false : [true, true, true]",
            "testWithMixedValues : true, false, true : [false, true, false]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        Boolean[] param = Arrays.stream(input.split(", ")).map(Boolean::valueOf).toArray(Boolean[]::new);
        Solution.inverseFlags(param);

        var result = Arrays.toString(param);

        assertEquals(expected, result);
    }
}
