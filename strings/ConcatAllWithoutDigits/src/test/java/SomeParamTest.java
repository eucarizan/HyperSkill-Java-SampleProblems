import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- concatenateStringsWithoutDigits({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid : Hello 123 World : HelloWorld",
            "testWithDigits : 123 456 789 : ''",
            "testWithEmptyStrings : '' : ''",
            "testWithMixedStrings : T7est i1nput : Testinput",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        String[] param = input.split("");

        var result = Solution.concatenateStringsWithoutDigits(param);

        assertEquals(expected, result);
    }
}
