public class Solution {
    public static int getMax(int[] nums) {
        int i = 0;
        int max = nums[i];
        while (nums[i] != 0) {
            max = Math.max(max, nums[i]);
            i++;
        }

        return max;
    }
}
