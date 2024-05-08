public class Solution {
    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder sb = new StringBuilder();

        for (String ch : strings) {
            if (!ch.matches("[0-9\\s]")) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
