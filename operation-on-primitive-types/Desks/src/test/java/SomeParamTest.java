import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- totalDesks({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZero : 0 : 0 : 0 : 0",
            "testWithMixedGroups : 20 : 21 : 22 : 32",
            "testWithEvenGroups : 16 : 18 : 20 : 27",
            "testWithOddGroups : 7 : 3 : 5 : 9",
            "testWithLargeGroups : 10000 : 9999 : 10001 : 15001",
    }, delimiter = ':')
    public void test(String name, int group1, int group2, int group3, int expected) {
        var result = Solution.totalDesks(group1, group2, group3);

        assertEquals(expected, result);
    }
}
