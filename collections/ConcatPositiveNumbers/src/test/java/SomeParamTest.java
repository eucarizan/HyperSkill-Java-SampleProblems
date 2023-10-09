import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- concatPositiveNumbers([{1}], [{2}]) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid : 8, 11, -2, -3, 14, 15 : -1, 33, 12, -3, -5 : [8, 11, 14, 15, 33, 12]",
    }, delimiter = ':')
    public void test(String name, String input1, String input2, String expected) {
        ArrayList<Integer> param1 = Arrays.stream(input1.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> param2 = Arrays.stream(input2.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        String result = ConcatPositiveNumbersProblem.concatPositiveNumbers(param1, param2).toString();

        assertEquals(expected, result);
    }
}
