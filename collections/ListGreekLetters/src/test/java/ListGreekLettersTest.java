import dev.nj.solutions.GreekLetter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ListGreekLetters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class ListGreekLettersTest {

    @ParameterizedTest(name = "{0} -- printLetters({1}) == {2}")
    @DisplayName("printLetters test")
    @CsvSource(value = {
            "test1 : Gamma, 3; Omega, 24; Alpha, 1 : {letter='Gamma', position=3}; {letter='Omega', position=24}; {letter='Alpha', position=1}",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<GreekLetter> param = Arrays.stream(input.split("; "))
                .map(s -> s.split(", "))
                .map(s -> new GreekLetter(s[0], Integer.parseInt(s[1])))
                .toList();

        var result = ListGreekLetters.printLetters(param);

        assertEquals(expected, result);
    }
}
