import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}, [{2}, {3}]) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testShape : Shape : 1 : 1 : 0",
            "testTriangle : Triangle : 4 : 3 : 6",
            "testCircle : Circle : 1.262 : 1 : 5",
            "testSquare : Square : 2 : 1 : 4",
            "testRectangle : Rectangle : 2 : 4 : 8",
    }, delimiter = ':')
    public void test(String name, String param, double a, double b, double expected) {
        double result = Solution.method(param, a, b).area();

        assertEquals(expected, result, 0.01);
    }
}
