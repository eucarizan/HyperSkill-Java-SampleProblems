import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.FlyingInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class FlyingInterfaceTest {

    @ParameterizedTest(name = "{0} -- printHeightInKm({1}) == {2}")
    @DisplayName("printHeightInKm test")
    @CsvSource(value = {
            "test1 : 1000 : 1",
            "test2 : 20000 : 20",
            "test3 : 300 : 0",
            "test4 : 5300 : 5",
    }, delimiter = ':')
    public void test(String name, int param, int expected) {
        var result = FlyingInterface.printHeightInKm(param);

        assertEquals(expected, result);
    }
}
