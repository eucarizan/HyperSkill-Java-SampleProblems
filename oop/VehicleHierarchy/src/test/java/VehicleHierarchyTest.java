import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.VehicleHierarchy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleHierarchyTest {

    @ParameterizedTest(name = "{0} -- printWheels({1}) == {2}")
    @DisplayName("printWheels test")
    @CsvSource(value = {
            "test1 : bicycle : A bicycle has 2 wheels.",
            "test2 : motorcycle : A motorcycle has 2 wheels.",
            "test3 : car : A car has 4 wheels."
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = VehicleHierarchy.printWheels(param);

        assertEquals(expected, result);
    }
}
