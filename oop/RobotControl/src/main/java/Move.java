public class Move {
    public static int[] moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (!"RIGHT".equals(robot.getDirection().name())) {
                robot.turnRight();
            }
        } else if (robot.getX() > toX) {
            while (!"LEFT".equals(robot.getDirection().name())) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() < toY) {
            while (!"UP".equals(robot.getDirection().name())) {
                robot.turnRight();
            }
        } else if (robot.getY() > toY) {
            while (!"DOWN".equals(robot.getDirection().name())) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }

        return new int[]{robot.getX(), robot.getY()};
    }
}
