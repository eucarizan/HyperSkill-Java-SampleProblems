package dev.nj.solutions;

public class TasteOfFruits {
    public static String printTaste(String fruitType) {
        Fruit fruit;
        if ("apple".equalsIgnoreCase(fruitType)) {
            fruit = new Apple();
        } else {
            fruit = new Orange();
        }
        return fruit.taste();
    }
}
