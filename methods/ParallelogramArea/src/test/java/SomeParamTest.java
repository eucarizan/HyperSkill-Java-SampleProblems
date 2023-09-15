import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- area({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testAreaWithPositiveBaseAndHeight : 5 : 4 : 20",
            "testAreaWithNegativeBaseAndPositiveHeight : -5 : 4 : 0",
            "testAreaWithZeroBaseAndPositiveHeight : 0 : 4 : 0",
            "testAreaWithPositiveBaseAndNegativeHeight : 5 : -4 : 0",
            "testAreaWithPositiveBaseAndZeroHeight : 5 : 0 : 0",
            "testAreaWithNegativeBaseAndNegativeHeight : -5 : -4 : 0",
    }, delimiter = ':')
    public void test(String name, int base, int height, int expected) {
        int result = Parallelogram.area(base, height);

        assertEquals(expected, result);
    }
}
