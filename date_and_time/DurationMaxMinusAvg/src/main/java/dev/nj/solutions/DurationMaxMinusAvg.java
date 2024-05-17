package dev.nj.solutions;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class DurationMaxMinusAvg {
    public static Duration getMaxMinusAvg(List<Duration> durations) {
        Duration max = Collections.max(durations);
        Duration avg = durations.stream()
                .reduce(Duration::plus)
                .orElse(Duration.ZERO)
                .dividedBy(durations.size());
        return max.minus(avg);
    }
}
