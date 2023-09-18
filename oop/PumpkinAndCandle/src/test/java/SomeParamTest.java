import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- addCandleForHalloween({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testAddCandleForHalloween : true : The candle is burning! Boooooo!",
            "testAddCandleNotForHalloween : false : We don't need a candle",
    }, delimiter = ':')
    public void test(String name, boolean input, String expected) {
        Pumpkin pumpkin = new Pumpkin(input);

        String result = pumpkin.addCandle();

        assertEquals(expected, result);
    }
}
