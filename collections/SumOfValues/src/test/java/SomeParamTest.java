import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- sumValues([{1}]) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : PROCESSING 10, HOLD 20, CLEARED 0 : 30",
            "test2 : Queen 1, ABBA 1, Beatles 1, Sabbath 1, Led 1 : 5",
            "test3 : Cat 1, Dog 2, Parrot 3, Canary 4 : 10",
            "test4 : A 1, B -2, C 3, D 5, E 3 : 10",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        Map<String, Integer> param = Arrays.stream(input.split(", "))
                .map(s -> s.split(" "))
                .collect(Collectors.toMap(p -> p[0], p -> Integer.parseInt(p[1])));

        int result = Solution.sum(param);

        assertEquals(expected, result);
    }
}
