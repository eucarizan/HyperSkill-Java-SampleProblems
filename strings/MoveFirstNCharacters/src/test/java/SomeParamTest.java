import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- moveNCharacters({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValidN : Hello, World! : 5 : , World!Hello",
            "testWithNEqualToStringLength : Testing : 7 : Testing",
            "testWithNGreaterThanStringLength : Edge : 10 : Edge",
            "testWithZero : Sample : 0 : Sample",
            "testWithEmptyString : '' : 5 : ''",
    }, delimiter = ':')
    public void test(String name, String param, int n, String expected) {
        var result = Solution.moveNCharacters(param, n);

        assertEquals(expected, result);
    }
}
