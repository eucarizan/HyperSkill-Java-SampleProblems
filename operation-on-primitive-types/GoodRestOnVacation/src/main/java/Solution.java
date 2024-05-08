public class Solution {
    public static int totalCost(int days, int foodCostPerDay, int flightCost, int hotelPerNight) {
        return foodCostPerDay * days + flightCost * 2 + hotelPerNight * (days - 1);
    }
}
