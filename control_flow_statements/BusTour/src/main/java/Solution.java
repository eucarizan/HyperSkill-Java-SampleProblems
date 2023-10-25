public class Solution {
    public static String willCrash(int height, int[] bridges) {
        for (int i = 0; i < bridges.length; i++) {
            if (height >= bridges[i]) {
                return "Will crash on bridge " + (i + 1);
            }
        }
        return "Will not crash";
    }
}
