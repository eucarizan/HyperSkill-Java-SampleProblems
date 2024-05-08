import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- startsOrEnds({1} -> {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : ing : Java is the most popular programming language : YES",
            "test2 : press : Regular expressions is hard to read, isn't it? : NO",
            "test3 : ho : Wow! How awesome is that! : YES",
            "test4 : ONE : ponep,onep! : YES",
            "test5 : ONE : ponep,pone! : YES",
            "test6 : Fi : You need to fill this blanks! : YES",
            "test7 : hi : You need to fill this blanks! : NO",
            "test8 : KS : You need to fill this blanks! : YES",
            "test9 : one : Do you need one or two of this? : YES",
            "test10 : prep : Prepare for fight : YES",
            "test11 : ight : Prepare for fight : YES",
            "test12 : ofor : Prepare for fight : NO",
            "test13 : foro : Prepare for fight : NO",
    }, delimiter = ':')
    public void test(String name, String text, String param, String expected) {
        String result = Solution.startsOrEnds(text, param);

        assertEquals(expected, result);
    }
}
