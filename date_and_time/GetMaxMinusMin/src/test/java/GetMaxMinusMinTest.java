import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.GetMaxMinusMin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class GetMaxMinusMinTest {

    @ParameterizedTest(name = "{0} -- {2} == getMaxMinusMin([{1}])")
    @DisplayName("get max minus min test")
    @CsvSource(value = {
            "test1; 1991-04-15T17:30:00Z, 1995-05-23T17:30:00Z, 2011-07-22T17:30:00Z, 2022-07-04T18:30:00Z; 985222800",
    }, delimiter = ';')
    public void test(String name, String input, long expected) {
        List<Instant> param = Arrays.stream(input.split(", "))
                .map(Instant::parse)
                .toList();

        var result = GetMaxMinusMin.getMaxMinusMin(param);

        assertEquals(expected, result);
    }
}
