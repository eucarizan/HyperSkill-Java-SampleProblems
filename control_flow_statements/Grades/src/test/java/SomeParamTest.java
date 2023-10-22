import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- tallyGrades({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid : B, C, D, C, B, C, D, D, B, C, C, B, A : [1, 4, 5, 3]",
            "testWithEmptyArray : '' : [0, 0, 0, 0]",
            "testWithInvalidGrades : X, Y, Z : [0, 0, 0, 0]",
            "testWithMixValidAndInvalid : A, B, E, F, G, A : [2, 1, 0, 0]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        String str = input.replace(", ", "");
        char[] param = str.toCharArray();

        var result = Solution.tallyGrades(param);

        assertEquals(expected, result);
    }
}
