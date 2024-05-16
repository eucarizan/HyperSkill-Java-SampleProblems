package dev.nj.solutions;

public class Fly implements Flying {
    private final int height;

    public Fly(int height) {
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
