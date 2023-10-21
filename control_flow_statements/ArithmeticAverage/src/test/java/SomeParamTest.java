import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- averageOfDivisibleBy3FromTo({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid : -5 : 12 : 4.5",
            "testWithSingleRange : 6 : 6 : 6.0",
            "testWithEmptyRange : 8 : 5 : 0.0",
            "testWithNegativeValues : -9 : -3 : -6.0"
    }, delimiter = ':')
    public void test(String name, int a, int b, double expected) {
        var result = Solution.averageOfDivisibleBy3FromTo(a, b);

        assertEquals(expected, result, 0.001);
    }
}
