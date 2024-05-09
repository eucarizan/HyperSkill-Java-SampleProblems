import dev.nj.solutions.GetMaxMinusMin;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] dateStr = {"1991-04-15T17:30:00Z", "1995-05-23T17:30:00Z", "2011-07-22T17:30:00Z", "2022-07-04T18:30:00Z"};
        List<Instant> instantList = Arrays.stream(dateStr)
                        .map(Instant::parse)
                                .toList();
        System.out.println(GetMaxMinusMin.getMaxMinusMin(instantList));
    }
}