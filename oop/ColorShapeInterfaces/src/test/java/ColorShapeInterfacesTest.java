import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.ColorShapeInterfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class ColorShapeInterfacesTest {

    @ParameterizedTest(name = "{0} -- printShapeAndColor({1}) == {2}")
    @DisplayName("printShapeAndColor test")
    @CsvSource(value = {
            "test1 : circle : [Circle, No Color]",
            "test2 : coloredCircle : [Circle, Red]",
            "test3 : shape : [Generic Shape, No Color]",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = ColorShapeInterfaces.printShapeAndColor(param);

        assertEquals(expected, result);
    }
}
