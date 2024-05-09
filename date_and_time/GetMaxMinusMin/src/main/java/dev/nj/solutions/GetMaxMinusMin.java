package dev.nj.solutions;

import java.time.Instant;
import java.util.List;

public class GetMaxMinusMin {
    public static long getMaxMinusMin(List<Instant> instantList) {
        //return instantList.stream().max(Instant::compareTo).get().minusSeconds(instantList.stream().min(Instant::compareTo).get());
        Instant time1 = instantList.stream().max(Instant::compareTo).orElse(instantList.get(0));
        Instant time2 = instantList.stream().min(Instant::compareTo).orElse(instantList.get(0));
        return time1.getEpochSecond() - time2.getEpochSecond();
    }
}
