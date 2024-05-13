package dev.nj.solutions;

public class VehicleHierarchy {
    public static String printWheels(String type) {
        Vehicle vehicle = switch (type) {
            case "car" -> new Car();
            case "motorcycle" -> new Motorcycle();
            case "bicycle" -> new Bicycle();
            default -> new Vehicle(0);
        };

        return "A " + type.toLowerCase() + " has " + vehicle.getNumWheels() + " wheels.";
    }
}
