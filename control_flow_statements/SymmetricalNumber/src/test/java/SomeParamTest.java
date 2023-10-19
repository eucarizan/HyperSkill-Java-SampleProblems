import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- isSymmetrical({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithSymmetric : 2002 : true",
            "testWithNonSymmetric : 2008 : false",
    }, delimiter = ':')
    public void test(String name, int param, boolean expected) {
        var result = Solution.reverse(param) == param;

        assertEquals(expected, result);
    }
}
