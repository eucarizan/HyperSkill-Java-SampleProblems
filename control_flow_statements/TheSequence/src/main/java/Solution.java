public class Solution {
    public static int highestDivisibleBy4(int[] nums) {
        final int n4 = 4;
        int i = 0;
        int max = Integer.MIN_VALUE;

        while (i < nums.length) {
            if (nums[i] % n4 == 0) {
                max = Math.max(max, nums[i]);
            }
            i++;
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }
}
