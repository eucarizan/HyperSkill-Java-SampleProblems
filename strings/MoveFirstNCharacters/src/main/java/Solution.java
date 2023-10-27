public class Solution {
    public static String moveNCharacters(String str, int n) {
        if (str.length() < n) {
            return str;
        }

        return str.substring(n) + str.substring(0, n);
    }
}
