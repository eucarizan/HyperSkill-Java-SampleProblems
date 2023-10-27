import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Bill : Shates : BillShates@work.net",
            "test2 : Elon : Tusk : ElonTusk@work.net",
    }, delimiter = ':')
    public void test(String name, String firstName, String surname, String expected) {
        var result = Solution.createEmail(firstName, surname);

        assertEquals(expected, result);
    }
}
