import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWith : batman batman batman i i I need am and and money : I am batman and i need money : You get money",
    }, delimiter = ':')
    public void test(String name, String input, String notesStr, String expected) {
        Map<String, Long> words = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        List<String> notes = Arrays.stream(notesStr.split(" ")).toList();

        String result = Solution.method(words, notes);

        assertEquals(expected, result);
    }

    @Test
    void testBestRatedMethod() {
        List<String> words = List.of("batman", "batman", "batman", "i", "i", "I", "need", "am", "and", "and", "money");
        List<String> notes = List.of("I", "am", "batman", "and", "i", "need", "money");
        String expected = "You get money";

        String result = Solution.bestRatedMethod(words, notes);

        assertEquals(expected, result);
    }
}
