import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- firstNumIsBetween({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithEqualNumbers : 3 : 3 : 3 : true",
            "testWithNotInBetween : 2 : 7 : 9 : false",
            "testWith2ndGreaterThan3rd : 40 : 100 : 20 : true",
            "testWith3rdGreaterThan2nd : 2 : 1 : 3 : true",
    }, delimiter = ':')
    public void test(String name, int num, int num1, int num2, boolean expected) {
        boolean result = Solution.isBetween(num, num1, num2);

        assertEquals(expected, result);
    }
}
