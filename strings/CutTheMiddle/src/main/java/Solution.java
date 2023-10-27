public class Solution {
    public static String removeMiddle(String str) {
        if (str.isEmpty()) {
            return "";
        }

        int mid = str.length() / 2;
        if (str.length() % 2 == 1) {
            return str.substring(0, mid) + str.substring(mid + 1);
        }

        return str.substring(0, mid - 1) + str.substring(mid + 1);
    }
}
