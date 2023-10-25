import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 7 : 1 2 2 3 3 3 4",
            "test2 : 1 : 1",
            "test3 : 0 : ''",
            "test4 : -5 : ''",
    }, delimiter = ':')
    public void test(String name, int param, String expected) {
        var result = Solution.generateSequence(param);

        assertEquals(expected, result);
    }
}
