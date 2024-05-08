import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testEmptyString : '' : false",
            "testValid : X777XX : true",
            "test3LetterSuffix : X777XXA : false",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        boolean result = VehicleRegistration.isValidNumber(param);

        assertEquals(expected, result);
    }
}
