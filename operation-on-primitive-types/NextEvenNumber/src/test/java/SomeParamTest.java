import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- next({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithZero : 0 : 2",
            "testWithOddNumber : 7 : 8",
            "testWithEvenNumber : 8 : 10",
            "testWithWithMaxValue : 10000 : 10002",
            "testWithWithOddMaxValue : 9999 : 10000 :",
    }, delimiter = ':')
    public void test(String name, int param, int expected) {
        int result = EvenNumber.next(param);

        assertEquals(expected, result);
    }
}
