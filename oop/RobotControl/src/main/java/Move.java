public class Move {
    public static int[] moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            faceRightDirection(robot, "RIGHT");
        } else if (robot.getX() > toX) {
            faceRightDirection(robot, "LEFT");
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() < toY) {
            faceRightDirection(robot, "UP");
        } else if (robot.getY() > toY) {
            faceRightDirection(robot, "DOWN");
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }

        return new int[]{robot.getX(), robot.getY()};
    }

    private static void faceRightDirection(Robot robot, String direction) {
        while (!direction.equals(robot.getDirection().name())) {
            robot.turnRight();
        }
    }

}
