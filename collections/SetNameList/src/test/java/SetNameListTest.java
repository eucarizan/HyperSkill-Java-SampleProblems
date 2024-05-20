import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.SetNameList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SetNameListTest {

    @ParameterizedTest(name = "{0} -- setList({1}) == {2}")
    @DisplayName("setList test")
    @CsvSource(value = {
            "test1 : John,Tim,John,Casey,Tim,Casey : [John, Tim, Casey]",
            "test2 : Robert,Julia,Martin,Julia,Robert : [Robert, Julia, Martin]",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = SetNameList.setList(param);

        assertEquals(expected, result);
    }
}
