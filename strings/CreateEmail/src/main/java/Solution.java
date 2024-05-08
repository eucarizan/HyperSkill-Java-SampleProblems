public class Solution {
    public static String createEmail(String name, String surname) {
        return new StringBuilder(name).append(surname).append("@work.net").toString();
    }
}
