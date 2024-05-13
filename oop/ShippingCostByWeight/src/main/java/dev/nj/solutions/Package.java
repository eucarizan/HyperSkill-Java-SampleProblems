package dev.nj.solutions;

public class Package {
    private final double weight;

    public Package(double weight) {
        this.weight = weight;
    }

    public double getShippingCost() {
        double min = 5.0;
        double cost = min;
        if (weight > min) {
            cost += Math.ceil(weight - min);
        }
        return cost;
    }
}