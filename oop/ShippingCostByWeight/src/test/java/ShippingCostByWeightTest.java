import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ShippingCostByWeight;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class ShippingCostByWeightTest {

    @ParameterizedTest(name = "{0} -- getShippingCost({1}) == {2}")
    @DisplayName("get shipping cost test")
    @CsvSource(value = {
            "test1 : 3.5 : 5.0",
            "test2 : 7.2 : 8.0",
    }, delimiter = ':')
    public void test(String name, double param, double expected) {
        var result = ShippingCostByWeight.printCost(param);

        assertEquals(expected, result);
    }
}
