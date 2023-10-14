import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- hasWordWithLength({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 3 : Java is the most popular programming language : YES",
            "test2 : 11 : Regular expression is hard to read, isnt it? : NO",
            "test3 : 4 : Wow! How awesome is that! : YES",
            "test4 : 1 : Ga@/,!?Taa!$[],aRaE,-+=!YaEaQ==_ : NO",
            "test5 : 2 : aa@/,!?aaa!$[],aaaa,-+=!aaaaa==_ : YES",
            "test6 : 3 : aV@/,!?Aaa!$[],aAaA,-+=!aaaAa==_ : YES",
            "test7 : 4 : aV@/,!?Aaa!$[],aAaA,-+=!aaaAa==_ : YES",
            "test8 : 5 : aV@/,!?Aaa!$[],aAaA,-+=!aaaAa==_ : YES",
            "test9 : 6 : Aa@/,!?aAa!$[],aaaA,-+=!aaaAa==_ : NO",
//            "test :  :  : YES NO",
    }, delimiter = ':')
    public void test(String name, int len, String param, String expected) {
        String result = Str.hasWordWithLength(len, param);

        assertEquals(expected, result);
    }
}
