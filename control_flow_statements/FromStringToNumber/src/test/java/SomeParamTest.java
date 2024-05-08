import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- numberToString({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWith1 : one : 1",
            "testWith2 : two : 2",
            "testWith3 : three : 3",
            "testWith4 : four : 4",
            "testWith5 : five : 5",
            "testWith6 : six : 6",
            "testWith7 : seven : 7",
            "testWith8 : eight : 8",
            "testWith9 : nine : 9",
            "testWith0 : zero : 0",
            "testWithOther : ten : 0",
    }, delimiter = ':')
    public void test(String name, String param, int expected) {
        var result = Solution.numberToString(param);

        assertEquals(expected, result);
    }
}
