import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- gcPercent({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testEmptyString : '' : 0.0",
            "testSingleG : g : 100.0",
            "testSingleC : c : 100.0",
            "testSingleGUpper : G : 100.0",
            "testSingleCUpper : C : 100.0",
            "testGCPercentWithCaseInsensitivity : gCgC : 100.0",
            "testWithNoGCCharacters : ATATATAT : 0.0",
            "testWithAllGCCharacters : GCGCGC : 100.0",
            "testGCPercentWithMixedCharacters : AGCafTGC : 50.0",
    }, delimiter = ':')
    public void test(String name, String param, double expected) {

        double result = GCCharacters.gcPercent(param);

        assertEquals(expected, result, 0.1);
    }
}
