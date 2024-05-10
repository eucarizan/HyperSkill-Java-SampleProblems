package dev.nj.solutions;

public class ManageCarSpeed {
    public static int displayCarSpeed(int speed) {
        Car car = new Car();
        car.drive(speed);
        return car.displaySpeed();
    }
}
