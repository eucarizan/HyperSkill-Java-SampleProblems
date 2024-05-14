import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.TasteOfFruits;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class TasteOfFruitsTest {

    @ParameterizedTest(name = "{0} -- printTaste({1}) == {2}")
    @DisplayName("printTaste test")
    @CsvSource(value = {
            "test1 : apple : Sweet",
            "test2 : orange : Sour",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = TasteOfFruits.printTaste(param);

        assertEquals(expected, result);
    }
}
