import java.util.Arrays;

public class Solution {
    public static int sumOfSixs(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 6 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sumOfSixsStream(int[] nums) {
        return Arrays.stream(nums)
                .filter(n -> n % 6 == 0)
                .reduce(0, Integer::sum);
    }
}
