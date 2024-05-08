import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- createEnglishAlphabet({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : A B C D E F G H I J K L M N O P Q R S T U V W X Y Z",
    }, delimiter = ':')
    public void test(String name, String expected) {
        var result = Solution.createEnglishAlphabet().toString();

        assertEquals(expected, result);
    }
}
