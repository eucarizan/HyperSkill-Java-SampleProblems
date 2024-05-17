import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ListMiddleElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class ListMiddleElementTest {

    @ParameterizedTest(name = "{0} -- getMiddle({1}) == {2}")
    @DisplayName("getMiddle test")
    @CsvSource(value = {
            "test1 : 5 : 3",
            "test2 : 4 : 2",
    }, delimiter = ':')
    public void test(String name, int param, int expected) {
        var result = ListMiddleElement.getMiddle(param);

        assertEquals(expected, result);
    }
}
