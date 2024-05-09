import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.EpochTimezoneSubtractor;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class EpochTimezoneSubtractorTest {

    @ParameterizedTest(name = "{0} -- subtractFromEpoch({1}, {2}) == {3}")
    @DisplayName("subtractFromEpoch test")
    @CsvSource(value = {
            "test1 ; 10 ; Asia/Yerevan ; 1969-12-22T04:00+04:00[Asia/Yerevan] ",
    }, delimiter = ';')
    public void test(String name, int days, String zone, String expected) {
        var result = EpochTimezoneSubtractor.subtractFromEpoch(days, zone);

        assertEquals(expected, String.valueOf(result));
    }
}
