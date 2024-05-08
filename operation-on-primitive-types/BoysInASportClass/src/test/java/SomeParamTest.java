import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithDescending : 165 : 161 : 158 : true",
            "testWithAscending : 161 : 161 : 165 : true",
            "testWithMixedOrder : 155 : 165 : 160 : false",
            "testWithSameHeight : 155 : 155 : 155 : true"
    }, delimiter = ':')
    public void test(String name, int h1, int h2, int h3, boolean expected) {
        boolean result = Solution.method(h1, h2, h3);

        assertEquals(expected, result);
    }
}
