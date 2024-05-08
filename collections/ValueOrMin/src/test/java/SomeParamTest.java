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

    @ParameterizedTest(name = "{0} -- getOrMin([{1}], {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : A 1, B 2, C 3 : B : 2",
            "test2 : A 1, B 2, C 3 : D : 1",
            "test3 : A 0, B 2, C 3 : A : 0",
            "test4 : A 1, B 2, C 3 : C : 3",
            "test5 : A 0, B 2, C 3 : E : 0",
    }, delimiter = ':')
    public void test(String name, String input, String key, int expected) {
        Map<String, Integer> param = Arrays.stream(input.split(", "))
                .map(s -> s.split(" "))
                .collect(Collectors.toMap(p -> p[0], p -> Integer.parseInt(p[1])));

        int result = Solution.getOrMin(param, key);

        assertEquals(expected, result);
    }
}
