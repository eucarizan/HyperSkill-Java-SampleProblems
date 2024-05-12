import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.BigIntegerConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class BigIntegerConverterTest {

    @ParameterizedTest(name = "{0} -- getBigInteger({1}) == {2}")
    @DisplayName("get big integer test")
    @CsvSource(value = {
            "test1 : 49225 : 49225 multiplied by 200 is 9845000",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = BigIntegerConverter.getBigInteger(param);

        assertEquals(expected, result);
    }
}
