import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ManageCarSpeed;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class ManageCarSpeedTest {

    @ParameterizedTest(name = "{0} -- displayCarSpeed({1}) == {2}")
    @DisplayName("display car speed test")
    @CsvSource(value = {
            "test1 : 100 : 100",
            "test2 : 200 : 200",
            "test3 : 300 : 200",
    }, delimiter = ':')
    public void test(String name, int speed, int expected) {
        var result = ManageCarSpeed.displayCarSpeed(speed);

        assertEquals(expected, result);
    }
}
