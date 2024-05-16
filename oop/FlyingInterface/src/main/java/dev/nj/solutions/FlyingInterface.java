package dev.nj.solutions;

public class FlyingInterface {
    public static int printHeightInKm(int meters) {
        return new Fly(meters).getHeightInKm();
    }
}
