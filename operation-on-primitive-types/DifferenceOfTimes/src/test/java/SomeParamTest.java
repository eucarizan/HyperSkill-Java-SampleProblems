import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- TimeDifference.getDifference({1}:{2}:{3}, {4}:{5}:{6}) == {7}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZero : 0 : 0 : 0 : 0 : 0 : 0 : 0",
            "testWithValid : 1 : 1 : 1 : 2 : 2 : 2 : 3661",
            "testWithValid : 1 : 2 : 30 : 1 : 3 : 20 : 50",
            "testWithNegativeDifference : 12 : 45 : 30 : 10 : 30 : 15 : -8115",
            "testWithZeroDifference : 5 : 15 : 30 : 5 : 15 : 30 : 0",
            "testWithMidnightToNoon : 0 : 0 : 0 : 12 : 0 : 0 : 43200",
            "testWith : 0 : 0 : 0 : 0 : 0 : 0 : 0",
    }, delimiter = ':')
    public void test(String name, int h1, int m1, int s1, int h2, int m2, int s2, int expected) {
        int result = TimeDifference.getDifference(h1, m1, s1, h2, m2, s2);

        assertEquals(expected, result);
    }
}
