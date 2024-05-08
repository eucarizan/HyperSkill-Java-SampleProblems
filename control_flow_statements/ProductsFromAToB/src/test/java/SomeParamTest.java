import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1 : 2 : 1",
            "test2 : 6 : 14 : 51891840",
            "testWithNoRange : 5 : 1 : 1",
            "testWithNegativeEvenRange : -6 : 0 : 720",
            "testWithNegativeOddRange : -5 : 0 : -120"
    }, delimiter = ':')
    public void test(String name, long a, long b, long expected) {
        var result = Solution.productFromAToB(a, b);

        assertEquals(expected, result);
    }
}
