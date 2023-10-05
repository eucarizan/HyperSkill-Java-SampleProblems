public class Solution {
    public static String getShape(int num) {
        final int square = 1;
        final int circle = 2;
        final int triangle = 3;
        final int rhombus = 4;

        return switch (num) {
            case square -> "You have chosen a square";
            case circle -> "You have chosen a circle";
            case triangle -> "You have chosen a triangle";
            case rhombus -> "You have chosen a rhombus";
            default -> "There is no such shape!";
        };
    }
}
