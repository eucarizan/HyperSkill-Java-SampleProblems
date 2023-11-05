import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- multiplyByTen({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 11, 12, 13 : [110, 120, 130]",
            "test2 : 11, abc, 13 : [110, Invalid user input -> abc, 130]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        String[] param = input.split(", ");
        var result = Arrays.toString(Solution.multiplyByTen(param));

        assertEquals(expected, result);
    }
}
