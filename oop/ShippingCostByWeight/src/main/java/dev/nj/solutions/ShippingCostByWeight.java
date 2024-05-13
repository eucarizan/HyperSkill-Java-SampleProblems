package dev.nj.solutions;

public class ShippingCostByWeight {
    public static double printCost(double weight) {
        Package pack = new Package(weight);
        return pack.getShippingCost();
    }
}
