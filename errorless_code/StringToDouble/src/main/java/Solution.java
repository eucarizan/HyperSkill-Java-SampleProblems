public class Solution {
    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input == null ? "" : input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
