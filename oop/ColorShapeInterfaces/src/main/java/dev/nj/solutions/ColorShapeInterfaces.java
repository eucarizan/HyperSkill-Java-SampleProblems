package dev.nj.solutions;

import java.util.Arrays;

public class ColorShapeInterfaces {
    public static String printShapeAndColor(String name) {
        GenericShape shape = switch (name.toLowerCase()) {
            case "circle" -> new Circle();
            case "coloredcircle" -> new ColoredCircle();
            default -> new GenericShape();
        };
        String[] out = {shape.name(), shape.color()};
        return Arrays.toString(out);
    }
}
