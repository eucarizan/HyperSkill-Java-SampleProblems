public class Solution {
    public static StringBuilder createEnglishAlphabet() {
        StringBuilder sb = new StringBuilder();

        for (int i = 'A'; i <= 'Z' ; i++) {
            sb.append((char) i).append(" ");
        }

        return sb.deleteCharAt(sb.length() - 1);
    }
}
