import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- getMonth({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testGetMonthJanuary : 1 : January",
            "testGetMonthFebruary : 2 : February",
            "testGetMonthMarch : 3 : March",
            "testGetMonthApril : 4 : April",
            "testGetMonthMay : 5 : May",
            "testGetMonthJune : 6 : June",
            "testGetMonthInvalid : 7 : error!",
    }, delimiter = ':')
    public void test(String name, int param, String expected) {
        String result = JanToJun.getMonth(param);

        assertEquals(expected, result);
    }
}
