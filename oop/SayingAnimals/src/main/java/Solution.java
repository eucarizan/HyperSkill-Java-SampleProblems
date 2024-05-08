public class Solution {
    public static Animal method(String animal) {
        return switch (animal.toLowerCase()) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            case "duck" -> new Duck();
            default -> new Animal();
        };
    }
}
