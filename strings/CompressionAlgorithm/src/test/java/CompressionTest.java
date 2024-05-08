import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class CompressionTest {
    @ParameterizedTest(name = "{0} -- Compression.process({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : aaaabbcaa : a4b2c1a2",
            "test2 : abc : a1b1c1",
            "test3 : aaaaa : a5",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        String result = Compression.compress(param);

        assertEquals(expected, result);
    }

}