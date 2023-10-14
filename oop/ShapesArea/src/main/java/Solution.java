public class Solution {
    public static Shape method(String shape, double a, double b) {
        return switch (shape.toLowerCase()) {
            case "triangle" -> new Triangle(a, b);
            case "circle" -> new Circle(a);
            case "square" -> new Square(a);
            case "rectangle" -> new Rectangle(a, b);
            default -> new Shape();
        };
    }
}
