import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- sum({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testValid : 5 : 21 : 221",
            "testPositiveNumbers : 1 : 5 : 15",
            "testNegativeNumbers : -3 : 3 : 0",
            "testSingleNumber : 7 : 7 : 7",
            "testReversed : 5 : 1 : 0",
    }, delimiter = ':')
    public void test(String name, int a, int b, int expected) {
        var result = Solution.sum(a, b);

        assertEquals(expected, result);
    }
}
