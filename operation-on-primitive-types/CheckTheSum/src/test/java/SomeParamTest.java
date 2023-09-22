import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- hasPairSumEqual20({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZero : 0 : 0 : 0 : false",
            "testWithOneValueEquals20 : 20 : 0 : 0 : true",
            "testWithOnePairEquals20 : 10 : 10 : 50 : true",
            "testWithAllExceeding20 : 10 : 11 : 12 : false",
            "testWithAllNotEnoughFor20 : 10 : 9 : 8 : false"
    }, delimiter = ':')
    public void test(String name, int n1, int n2, int n3, boolean expected) {

        var result = Solution.method(n1, n2, n3);

        assertEquals(expected, result);
    }
}
