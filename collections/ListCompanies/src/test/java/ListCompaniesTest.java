import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ListCompanies;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCompaniesTest {

    @ParameterizedTest(name = "{0} -- companyToList({1}) == {2}")
    @DisplayName("companyToList test")
    @CsvSource(value = {
            "test1 : Google Oracle JetBrains : [Google, Oracle, JetBrains]",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = ListCompanies.companyToList(param);

        assertEquals(expected, result);
    }
}
