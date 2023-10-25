import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- learnProgramming({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithJava : 1 : Yes!",
            "testWithKotlin : 2 : Yes!",
            "testWithScala : 3 : Yes!",
            "testWithPyhon : 4 : Yes!",
            "testWithGo : 5 : Unknown number",
    }, delimiter = ':')
    public void test(String name, int param, String expected) {
        var result = Solution.learnProgramming(param);

        assertEquals(expected, result);
    }
}
