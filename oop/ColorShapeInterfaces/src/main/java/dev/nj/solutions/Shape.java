package dev.nj.solutions;

public interface Shape {
    default String name() {
        return "Generic Shape";
    }
}
