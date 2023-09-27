public class Solution {
    public static String matchesDate(String date) {
        return date.matches("(^((0[1-9])|([1-2][0-9])|(3[0-1]))|" +
                "(^(19|20)[0-9][0-9]))" +
                "[-/. ]((0[1-9])|1[0-2])[-/. ]" +
                "(((19|20)[0-9][0-9])|((0[1-9])|([1-2][0-9])|(3[0-1])))") ? "Yes" : "No";
    }
}
