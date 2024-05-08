public class Solution {
    public static void inverseFlags(Boolean[] flags) {
        for (int i = 0; i < flags.length; i++) {
            flags[i] = !flags[i];
        }
    }
}
