import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
            "testWithLargeNum : 6188989133 : 13",
            "testWithSmallNum : 6 : 4",
    }, delimiter = ':')
    public void test(String name, long param, long expected) {
        var result = Solution.method(param);

        assertEquals(expected, result);
    }
}
