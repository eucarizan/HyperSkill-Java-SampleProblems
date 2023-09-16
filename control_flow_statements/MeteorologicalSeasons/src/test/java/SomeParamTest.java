import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- Meteorological.season({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testMeteorologicalSeason_Spring : SPRING : 20",
            "testMeteorologicalSeason_Summer : SUMMER : 37",
            "testMeteorologicalSeason_Autumn : AUTUMN : 20",
            "testMeteorologicalSeason_Winter : WINTER : 1",
            "testMeteorologicalSeason_NotExisting : TAGULAN : 0",
    }, delimiter = ':')
    public void test(String name, String param, int expected) {
        int result = Meteorological.season(param);

        assertEquals(expected, result);
    }
}
