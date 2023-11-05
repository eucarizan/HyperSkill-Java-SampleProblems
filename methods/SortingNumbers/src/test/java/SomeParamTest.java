import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- sort({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3, 4, 5 : [1, 2, 3, 4, 5]",
            "test2 : 5, 4, 3, 2, 1 : [1, 2, 3, 4, 5]",
            "test3 : 3, 1, 5, 4, 2 : [1, 2, 3, 4, 5]",
            "test4 : 3, 1, 5, 3, 2, 1, 4 : [1, 1, 2, 3, 3, 4, 5]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] nums = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        Solution.sort(nums);

        var result = Arrays.toString(nums);

        assertEquals(expected, result);
    }
}
