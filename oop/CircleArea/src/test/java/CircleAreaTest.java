import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.CircleArea;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class CircleAreaTest {

    @ParameterizedTest(name = "{0} -- printArea({1}) == {2}")
    @DisplayName("printArea test")
    @CsvSource(value = {
            "test1 : 1 : 3.14",
            "test2 : 1.1289 : 4.00",
    }, delimiter = ':')
    public void test(String name, double input, String expected) {
        var result = String.format("%.2f", CircleArea.printArea(input));

        assertEquals(expected, result);
    }
}
