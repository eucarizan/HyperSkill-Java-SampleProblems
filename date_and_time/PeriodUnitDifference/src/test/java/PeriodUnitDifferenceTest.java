import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.PeriodUnitDifference;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Period;
import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class PeriodUnitDifferenceTest {

    @ParameterizedTest(name = "{0} -- getSumMinusMin({1}) == {2}")
    @DisplayName("get sum minus min test")
    @CsvSource(value = {
            "test1 : 1989 6 23, 1991 5 22, 1994 4 21, 1993 3 19, 1988 2 18 : P7967Y18M85D",
    }, delimiter = ':')
    public void test(String name, String input, Period expected) {
        List<Period> param = Arrays.stream(input.split(", "))
                .map(s -> s.split(" "))
                .map(s -> new int[]{Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2])})
                .map(nums -> Period.of(nums[0], nums[1], nums[2]))
                .toList();

        var result = PeriodUnitDifference.getSumMinusMin(param);

        assertEquals(expected, result);
    }
}
