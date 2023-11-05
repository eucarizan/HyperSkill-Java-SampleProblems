import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- addValueByIndex([{1}], {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValidIndex : 1, 2, 3, 4 : 2 : 10 : [1, 2, 13, 4]",
            "testWithNegativeIndex : 1, 2, 3, 4 : -1 : 10 : [1, 2, 3, 4]",
            "testWithIndexGreaterThanLength : 1, 2, 3, 4 : 10 : 10 : [1, 2, 3, 4]",
    }, delimiter = ':')
    public void test(String name, String input, int index, long num, String expected) {
        long[] param = Arrays.stream(input.split(", ")).mapToLong(Long::parseLong).toArray();
        Solution.addValueByIndex(param, index, num);

        var result = Arrays.toString(param);

        assertEquals(expected, result);
    }
}
