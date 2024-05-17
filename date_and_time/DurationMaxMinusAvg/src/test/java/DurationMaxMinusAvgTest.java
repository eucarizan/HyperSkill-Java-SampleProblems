import dev.nj.solutions.DurationMaxMinusAvg;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class DurationMaxMinusAvgTest {

    @Test
    @DisplayName("getMaxMinusAvg test")
    public void test() {
        List<Duration> param = List.of(
                Duration.of(2, ChronoUnit.DAYS),
                Duration.of(3, ChronoUnit.HOURS),
                Duration.of(35, ChronoUnit.MINUTES),
                Duration.of(300, ChronoUnit.MINUTES),
                Duration.of(300, ChronoUnit.SECONDS)
        );

        var result = DurationMaxMinusAvg.getMaxMinusAvg(param).toString();

        assertEquals("PT36H40M", result);
    }
}
