import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- move({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWith1 : 1 : move up",
            "testWith2 : 2 : move down",
            "testWith3 : 3 : move left",
            "testWith4 : 4 : move right",
            "testWith0 : 0 : do not move",
            "testWith5 : 5 : error!",
    }, delimiter = ':')
    public void test(String name, int param, String expected) {
        var result = Solution.move(param);

        assertEquals(expected, result);
    }
}
