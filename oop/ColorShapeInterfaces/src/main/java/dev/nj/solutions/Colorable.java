package dev.nj.solutions;

public interface Colorable {
    default String color() {
        return "No Color";
    }
}
