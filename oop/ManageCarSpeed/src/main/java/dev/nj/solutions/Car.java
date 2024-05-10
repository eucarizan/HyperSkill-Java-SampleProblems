package dev.nj.solutions;

public class Car {
    private int speed;

    public Car() {
        speed = 0;
    }

    public void drive(int increase) {
        speed = Math.min(speed + increase, 200);
    }

    public int displaySpeed() {
        return speed;
    }
}
