import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- getShape({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithSquare : 1 : You have chosen a square",
            "testWithCircle : 2 : You have chosen a circle",
            "testWithTriangle : 3 : You have chosen a triangle",
            "testWithRhombus : 4 : You have chosen a rhombus",
            "testWithNotShape : 5 : There is no such shape!",
    }, delimiter = ':')
    public void test(String name, int param, String expected) {
        String result = Solution.getShape(param);

        assertEquals(expected, result);
    }
}
