import java.util.Arrays;

public class Solution {
    public static int maxByDivisibleBy4(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 4 == 0) {
                max = Math.max(num, max);
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }

    public static int maxBy4Stream(int[] nums) {
        return Arrays.stream(nums)
                .filter(n -> n % 4 == 0)
                .max()
                .orElse(-1);
    }
}
