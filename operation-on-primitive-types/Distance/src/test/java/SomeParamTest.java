import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- averageSpeedOfBus({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValidDistance1 : 100 : 50.0",
            "testWithValidDistance2 : 150 : 75.0",
            "testWithZeroDistance : 0 : 0.0",
    }, delimiter = ':')
    public void test(String name, int distance, double expected) {
        var result = Distance.averageSpeedOfBus(distance);

        assertEquals(expected, result);
    }
}
