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

    @ParameterizedTest(name = "{0} -- method([{1}], {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWith : 1 aa, 5 ee, 2 bb, 4 dd, 3 cc : 2 : 4 : {2=bb, 3=cc, 4=dd}",
    }, delimiter = ':')
    public void test(String name, String input, int from, int to, String expected) {
        Map<Integer, String> param = Arrays.stream(input.split(", "))
                .map(s -> s.split(" "))
                .collect(Collectors.toMap(p -> Integer.parseInt(p[0]), p -> p[1]));

        String result = Solution.method(param, from, to).toString();

        assertEquals(expected, result);
    }
}
