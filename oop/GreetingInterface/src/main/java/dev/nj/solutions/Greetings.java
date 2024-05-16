package dev.nj.solutions;

public interface Greetings {
    default String greet(String str) {
        return String.format("Hello, %s!", str);
    }
}
