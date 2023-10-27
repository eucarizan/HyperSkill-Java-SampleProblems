public class Solution {
    public static String convertDate(String str) {
        String yyyy = str.substring(0, 4);
        String mm = str.substring(5, 7);
        String dd = str.substring(8);
        return mm + "/" + dd + "/" + yyyy;
    }
}
