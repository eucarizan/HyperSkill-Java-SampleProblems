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
            "testSeasonSpring : SPRING : 20",
            "testSeasonSummer : SUMMER : 37",
            "testSeasonAutumn : AUTUMN : 20",
            "testSeasonWinter : WINTER : 1",
            "testSeasonInvalidInput : TAGULAN : 0",
            "testSeasonCaseInsensitiveInput : summer : 37",
            "testSeasonNullInput : : 0",
    }, delimiter = ':')
    public void test(String name, String param, int expected) {
        int result = Meteorological.season(param);

        assertEquals(expected, result);
    }
}
