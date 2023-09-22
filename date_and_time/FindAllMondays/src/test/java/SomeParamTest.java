import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {
    @ParameterizedTest(name = "{0} -- AllMondays.find({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZero : 0 : 0 : []",
            "testWithInvalidYear : -2023 : 5 : []",
            "testWithInvalidMonth : 2023 : -5 : []",
            "testWithYear1Month1 : 1 : 1 : [0001-01-01, 0001-01-08, 0001-01-15, 0001-01-22, 0001-01-29]",
            "testWithValid : 2017 : 1 : [2017-01-02, 2017-01-09, 2017-01-16, 2017-01-23, 2017-01-30]",
            "testWithMaxYearMaxMonth : 9999 : 12 : [9999-12-06, 9999-12-13, 9999-12-20, 9999-12-27]",
            "testWithExceeding1Month : 2017 : 13 : [2018-01-01, 2018-01-08, 2018-01-15, 2018-01-22, 2018-01-29]",
            "testWithExceeding36Months : 2017 : 37 : [2020-01-06, 2020-01-13, 2020-01-20, 2020-01-27]",
    }, delimiter = ':')
    public void test(String name, int year, int month, String expected) {
        String result = AllMondays.find(year, month).toString();

        assertEquals(expected, result);
    }

}
