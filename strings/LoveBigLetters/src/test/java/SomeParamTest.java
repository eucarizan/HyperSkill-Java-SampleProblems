import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- upperEvenLetters({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : computer : CoMpUtEr",
            "test2 : programming : PrOgRaMmInG",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = Solution.upperEvenLetters(param);

        assertEquals(expected, result);
    }
}
