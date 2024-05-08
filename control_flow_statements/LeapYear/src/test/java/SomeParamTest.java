import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- isLeapYear({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithRegular : 2100 : false",
            "testWithLeap : 2000 : true",
            "test3 : 2014 : false",
            "test4 : 2400 : true",
            "test5 : 2008 : true",
            "test6 : 2148 : true",
            "test7 : 2078 : false",
            "test8 : 2691 : false",
            "test9 : 2395 : false",
            "test10 : 2390 : false",
            "test11 : 2736 : true",
            "test12 : 2770 : false",
            "test13 : 2526 : false",
            "test14 : 2054 : false",
            "test15 : 2686 : false",
    }, delimiter = ':')
    public void test(String name, int param, boolean expected) {
        var result = Solution.isLeapYear(param);

        assertEquals(expected, result);
    }
}
