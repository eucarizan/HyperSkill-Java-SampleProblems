import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.SetRemove;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SetRemoveTest {

    @ParameterizedTest(name = "{0} -- getSetFromString([{1}]) == {2}")
    @DisplayName("getSetFromString test")
    @CsvSource(value = {
            "test1 : 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]",
            "test2 : 11 12 13 14 15 16 17 18 19 20 : [16, 17, 18, 19, 20, 11, 12, 13, 14, 15]",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = String.join(" ", SetRemove.getSetFromString(param).toString());

        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "{0} -- removeAllNumbersGreaterThan10([{1}]) == [{2}]")
    @DisplayName("removeAllNumbersGreaterThan10 test")
    @CsvSource(value = {
            "test1 : 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 : 1 2 3 4 5 6 7 8 9 10 ",
            "test2 : 11 12 13 14 15 16 17 18 19 20 : ''",
    }, delimiter = ':')
    public void test2(String name, String param, String expected) {
        var result = SetRemove.getSetFromString(param);
        SetRemove.removeAllNumbersGreaterThan10(result);

        assertEquals(expected, result.toString().replaceAll("[\\[\\],]", ""));
    }
}
