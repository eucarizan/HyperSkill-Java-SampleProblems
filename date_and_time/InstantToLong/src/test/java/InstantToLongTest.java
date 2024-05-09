import dev.nj.solutions.InstantToLong;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class InstantToLongTest {

    @ParameterizedTest(name = "{0} -- dateInEpochSecond({1}) == {2}")
    @DisplayName("date in epoch second test")
    @CsvSource(value = {
            "test1 , 1991-04-15T17:30:00Z , 671736600",
    }, delimiter = ',')
    public void test(String name, String param, long expected) {
        var result = InstantToLong.dateInEpochSecond(param);

        assertEquals(expected, result);
    }
}
