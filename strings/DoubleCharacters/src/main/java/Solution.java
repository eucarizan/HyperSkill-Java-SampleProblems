public class Solution {
    public static String doubleChars(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            sb.append(ch).append(ch);
        }

        return sb.toString();
    }
}
