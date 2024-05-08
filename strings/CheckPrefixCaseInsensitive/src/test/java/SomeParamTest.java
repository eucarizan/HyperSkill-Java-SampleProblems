import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- startsWithJ({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testEmpty : '' : false",
            "testSpecialCharacter : !@#(&$ : false",
            "testSingleJ : j : true",
            "testWordWithJ : java : true",
            "testWordWithMultipleJ : jjjj : true",
            "testWordNotStartingInJ : Kotlin : false",
            "testWordCaseSensitivity : Java : true",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        boolean result = CheckString.startsWithJ(param);

        assertEquals(expected, result);
    }
}
