import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> collatzSequence(int num) {
        List<Integer> nums = new ArrayList<>();
        nums.add(num);

        while (num != 1) {
            if (num % 2 != 0) {
                num = num * (2 + 1) + 1;
            } else {
                num /= 2;
            }
            nums.add(num);
        }

        return nums;
    }
}
