import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {
    @ParameterizedTest(name = "{0} -- DaysOfTheWeek({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testDayOfWeekMonday : MONDAY : 6",
            "testDayOfWeekTuesday : TUESDAY : 7",
            "testDayOfWeekWednesday : WEDNESDAY : 9",
            "testDayOfWeekThursday : THURSDAY : 8",
            "testDayOfWeekFriday : FRIDAY : 6",
            "testDayOfWeekSaturday : SATURDAY : 8",
            "testDayOfWeekSunday : SUNDAY : 6",
            "testDayOfWeekInvalid : LAZYDAY : 0",
            "testDayOfWeekNull : : 0",
    }, delimiter = ':')
    public void test(String name, String param, int expected) {
        int result = DaysOfWeek.dayValue(param);

        assertEquals(expected, result);
    }
}
