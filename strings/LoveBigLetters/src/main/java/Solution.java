public class Solution {
    public static String upperEvenLetters(String message) {
        StringBuilder sb = new StringBuilder(message);

        for (int i = 0; i < message.length(); i += 2) {
            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }

        return sb.toString();
    }
}
