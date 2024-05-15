package dev.nj.solutions;

public class CircleArea {
    public static double printArea(double radius) {
        Measurable shape = new Circle(radius);
        return shape.area();
    }
}
