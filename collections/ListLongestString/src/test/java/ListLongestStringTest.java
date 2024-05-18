import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ListLongestString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class ListLongestStringTest {

    @ParameterizedTest(name = "{0} -- changeList({1}) == {2}")
    @DisplayName("changeList test")
    @CsvSource(value = {
            "test1 : hi, hello, goodmorning : goodmorning goodmorning goodmorning",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<String> param = Arrays.stream(input.split(", "))
                .collect(Collectors.toCollection(ArrayList::new));

        ListLongestString.changeList(param);

        assertEquals(expected, String.join(" ", param));
    }
}
