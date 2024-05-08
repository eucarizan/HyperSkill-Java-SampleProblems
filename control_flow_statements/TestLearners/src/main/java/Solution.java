public class Solution {
    public static String learnProgramming(int n) {
        String out;

        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4:
                out = "Yes!";
                break;
            default:
                out = "Unknown number";
        }

        return out;
    }
}
