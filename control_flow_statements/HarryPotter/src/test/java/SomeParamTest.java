import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- hogwartsHouses({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : gryffindor : bravery",
            "test2 : hufflepuff : loyalty",
            "test3 : slytherin : cunning",
            "test4 : ravenclaw : intellect",
            "test5 : targaryen : not a valid house",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = Solution.hogwartsHouses(param);

        assertEquals(expected, result);
    }
}
