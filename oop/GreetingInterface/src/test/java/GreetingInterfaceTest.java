import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.GreetingInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class GreetingInterfaceTest {

    @ParameterizedTest(name = "{0} -- printGreet({1}) == {2}")
    @DisplayName("printGreet test")
    @CsvSource(value = {
            "test1 : John : Hello, John!",
            "test2 : Alice : Hello, Alice!",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = GreetingInterface.printGreet(param);

        assertEquals(expected, result);
    }
}
