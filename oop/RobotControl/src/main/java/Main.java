import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Move.moveRobot(new Robot(0, 0, Direction.UP), 10, 0)));
    }
}