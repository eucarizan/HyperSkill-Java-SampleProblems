package dev.nj.solutions;

public class GreetingInterface {
    public static String printGreet(String str) {
        return new GreetingImpl().greet(str);
    }
}
