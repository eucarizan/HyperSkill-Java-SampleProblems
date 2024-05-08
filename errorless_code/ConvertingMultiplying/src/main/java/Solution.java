public class Solution {
    public static String[] multiplyByTen(String[] nums) {
        for (int i = 0; i < nums.length; i++) {
            try {
                int num = Integer.parseInt(nums[i]);
                nums[i] = String.valueOf(num * 10);
            } catch (NumberFormatException e) {
                nums[i] = "Invalid user input -> " + nums[i];
            }
        }
        return nums;
    }
}
