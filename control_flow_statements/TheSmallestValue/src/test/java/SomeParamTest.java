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
            "test3 : 6227020800 : 14",
            "test4 : 4371919911 : 13",
            "test5 : 6000784116 : 13",
            "test6 : 2446070542 : 13",
            "test7 : 1584721623 : 13",
            "test8 : 3482876679 : 13",
            "test9 : 7364741330 : 14",
            "test10 : 5009877486 : 13",
            "test11 : 3255664916 : 13",
            "test12 : 6631681255 : 14",
            "test13 : 4633874282 : 13",
    }, delimiter = ':')
    public void test(String name, long param, long expected) {
        var result = Solution.method(param);

        assertEquals(expected, result);
    }
}
