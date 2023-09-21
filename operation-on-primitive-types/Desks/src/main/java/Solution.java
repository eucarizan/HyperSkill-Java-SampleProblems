public class Solution {
    public static int totalDesks(int group1, int group2, int group3) {
        return desksPerGroup(group1) + desksPerGroup(group2) + desksPerGroup(group3);
    }

    private static int desksPerGroup(int num) {
        return num / 2 + num % 2;
    }

    public static int totalDesksSimple(int g1, int g2, int g3) {
        return (g1 + 1) / 2 + (g2 + 1) / 2 + (g3 + 1) / 2;
    }
}
