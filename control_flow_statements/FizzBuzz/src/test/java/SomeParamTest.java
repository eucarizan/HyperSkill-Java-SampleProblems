import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- fizzBuzz({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithPositive : 8 : 16 : [8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16]",
            "testWithNegative : -16 : -8 : [-16, FizzBuzz, -14, -13, Fizz, -11, Buzz, Fizz, -8]",
            "testWithNoRange : 15 : 15 : [FizzBuzz]",
            "testWithNoDivisible : 7 : 8 : [7, 8]",
            "testWithEmptyRange : 8 : 5 : []",
    }, delimiter = ':')
    public void test(String name, int a, int b, String expected) {
        var result = Solution.fizzBuzz(a, b).toString();

        assertEquals(expected, result);
    }
}
