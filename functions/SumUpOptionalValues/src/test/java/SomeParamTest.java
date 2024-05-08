import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 6",
            "test2 : 1, 2, null, 4, 5 : 12",
            "test3 : null, null, null : 0",
            "test4 : 100, null, 55, null, 45 : 200",
            "test5 : 17, 3, 22 : 42",
            "test6 : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 : 55",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        List<Optional<Integer>> param = Arrays.stream(input.split(", "))
                .map(s -> "null".equals(s) ? Optional.<Integer>empty() : Optional.of(Integer.valueOf(s)))
                .toList();

        var result = Solution.method(param);

        assertEquals(expected, result);
    }
}