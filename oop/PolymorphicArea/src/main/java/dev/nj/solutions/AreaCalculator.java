package dev.nj.solutions;

import java.util.Arrays;

public class AreaCalculator {
    public static String calculateArea(String shapeType, String input) {
        Shape shape;
        return switch (shapeType.toLowerCase()) {
            case "rectangle" -> {
                double[] dimensions = Arrays.stream(input.split(" ")).mapToDouble(Double::parseDouble).toArray();
                shape = new Rectangle(dimensions[0], dimensions[1]);
                yield String.format("%.2f", shape.calculateArea());
            }
            case  "circle" -> {
                double radius = Double.parseDouble(input);
                shape = new Circle(radius);
                yield String.format("%.2f", shape.calculateArea());
            }
            default -> "Invalid shape type";
        };
    }
}
