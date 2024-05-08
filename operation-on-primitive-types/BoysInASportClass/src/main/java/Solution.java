public class Solution {
    public static boolean method(int h1, int h2, int h3) {
        return (h1 - h2 >= 0 && h2 - h3 >= 0) || (h1 - h2 <= 0 && h2 - h3 <= 0);
    }
}
