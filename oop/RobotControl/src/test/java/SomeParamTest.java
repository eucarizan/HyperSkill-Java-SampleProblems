import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- move(Robot({1}, {2}, {3}), Target({4}, {5})) == {6}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid1 : 0 : 0 : UP : 10 : 0 : [10, 0]",
            "testWithValid2 : 0 : 0 : DOWN : 10 : 0 : [10, 0]",
            "testWithValid3 : 0 : 0 : RIGHT : 10 : 0 : [10, 0]",
            "testWithValid4 : 0 : 0 : LEFT : 10 : 0 : [10, 0]",
    }, delimiter = ':')
    public void test(String name, int initX, int initY, String direction, int toX, int toY, String expected) {
        Direction initDirection = switch (direction.toUpperCase()) {
            case "UP" -> Direction.UP;
            case "DOWN" -> Direction.DOWN;
            case "LEFT" -> Direction.LEFT;
            case "RIGHT" -> Direction.RIGHT;
            default -> null;
        };

        String result = Arrays.toString(Move.moveRobot(new Robot(initX, initY, initDirection), toX, toY));

        assertEquals(expected, result);
    }
}
