import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- countDivisibleBy{3}({1}, {2}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid1 : 10 : 20 : 10 : 2",
            "testWithValid2 : 15 : 25 : 5 : 3",
    }, delimiter = ':')
    public void test(String name, int a, int b, int n, int expected) {
        int result = Solution.count(a, b, n);

        assertEquals(expected, result);
    }
}
