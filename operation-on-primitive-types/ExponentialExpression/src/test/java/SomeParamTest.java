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
            "test1 : 22.5 : 11920.375",
            "test2 : 20.1 : 8545.711",
            "test3 : 1 : 4",
            "test4 : 4 : 85",
            "test5 : 6 : 259",
            "test6 : 9 : 820",
            "test7 : 7 : 400",
    }, delimiter = ':')
    public void test(String name, double param, double expected) {
        double result = Solution.method(param);

        assertEquals(expected, result, 0.01);
    }
}
