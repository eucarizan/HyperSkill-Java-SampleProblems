public class Solution {
    public static int zeroOrGreaterThan1k(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
            if (num == 0 || sum > 1000) {
                break;
            }
        }

        return sum > 1000 ? sum - 1000 : sum;
    }
}
