import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> evenOrOdd(int[] nums) {
        List<String> list = new ArrayList<>();

        for (int num : nums) {
            if (num == 0) {
                break;
            }
            list.add(num % 2 == 0 ? "even" : "odd");
        }
        
        return list;
    }
}
