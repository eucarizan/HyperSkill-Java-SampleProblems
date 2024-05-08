import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- totalCost(days[{1}], food[{2}], flight[{3}], hotel[{4}]) == {5}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithPositiveValues : 7 : 50 : 200 : 100 : 1350",
            "testWithZeroDays : 0 : 50 : 200 : 100 : 300",
            "testWithZeroFoodCost : 5 : 0 : 200 : 100 : 800",
            "testWithZeroFlightCost : 3 : 50 : 0 : 100 : 350",
            "testWithZeroHotelCost : 3 : 50 : 200 : 0 : 550"
    }, delimiter = ':')
    public void test(String name, int days, int food, int flight, int hotel, int expected) {
        int result = Solution.totalCost(days, food, flight, hotel);

        assertEquals(expected, result);
    }
}
