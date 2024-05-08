import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : ident, i, __, 1a, b33, _n1 : [__, 1a]",
            "test2 : qq, 33, Qq, $5, _4sample : [33, $5]",
            "test3 : longName, 2longName, _ : [2longName, _]",
            "test4 : a12312312313, A_B_C_D_E_F, 4fdsfsfDFfd : [4fdsfsfDFfd]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<String> param = Arrays.stream(input.split(", ")).toList();

        String result = Solution.method(param).toString();

        assertEquals(expected, result);
    }
}
