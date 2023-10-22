import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> fizzBuzz(int n1, int n2) {
        List<String> out = new ArrayList<>();

        for (int i = n1; i <= n2; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            if (i % 3 == 0) {
                sb.append("Fizz");
                count++;
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
                count++;
            }
            if (count == 0) {
                sb.append(i);
            }
            out.add(sb.toString());
        }

        return out;
    }
}
