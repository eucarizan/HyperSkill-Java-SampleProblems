import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method([{1}]) == [{2}]")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid : 5, -8, 10 : 5 was bought, -8 was sold, 10 was bought",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<Integer> param = Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .toList();

        String result = String.join(", ", Solution.method(param));

        assertEquals(expected, result);
    }
}
