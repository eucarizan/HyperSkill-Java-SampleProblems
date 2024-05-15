import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.AreaCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class AreaCalculatorTest {

    @ParameterizedTest(name = "{0} -- calculateArea({1}) == {2}")
    @DisplayName("calculateArea test")
    @CsvSource(value = {
            "test1 : rectangle : 5 3 : 15.00",
            "test2 : circle : 2.5 : 19.63",
            "test3 : square : 5 : Invalid shape type",
    }, delimiter = ':')
    public void test(String name, String param, String input, String expected) {
        var result = AreaCalculator.calculateArea(param, input);

        assertEquals(expected, result);
    }
}
