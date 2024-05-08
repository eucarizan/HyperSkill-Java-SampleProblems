import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- isSuccessfulParty({1}, isWeekend[{2}]) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithWeekdayLowerThanMin : 1 : false : false",
            "testWithWeekdayHigherThanMax : 21 : false : false",
            "testWithWeekendLowerThanMin : 14 : true : false",
            "testWithWeekendHigherThanMax : 26 : true : false",
            "testWithWeekdayEqualToMin : 10 : false : true",
            "testWithWeekdayInRange : 15 : false : true",
            "testWithWeekdayEqualToMax : 20 : false : true",
            "testWithWeekendEqualToMin : 15 : true : true",
            "testWithWeekendInRange : 20 : true : true",
            "testWithWeekendEqualToMax : 25 : true : true",
    }, delimiter = ':')
    public void test(String name, int butterCups, boolean isWeekend, boolean expected) {
        boolean result = Solution.isSuccessfulParty(butterCups, isWeekend);

        assertEquals(expected, result);
    }
}
