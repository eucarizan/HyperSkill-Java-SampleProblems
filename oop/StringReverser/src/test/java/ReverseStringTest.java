import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ReverseString;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class ReverseStringTest {

    @ParameterizedTest(name = "{0} -- reverse({1}) == {2}")
    @DisplayName("reverse test")
    @CsvSource(value = {
            "test1 : line : enil",
            "test2 : aba : aba",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = ReverseString.reverse(param);

        assertEquals(expected, result);
    }
}
