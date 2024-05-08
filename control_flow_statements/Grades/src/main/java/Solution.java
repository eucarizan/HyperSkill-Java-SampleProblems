import java.util.Arrays;

public class Solution {
    public static String tallyGrades(char[] grades) {
        int[] total = new int[4];

        for (char grade : grades) {
            if (grade - 'A' >= 0 && grade - 'A' <= 3) {
                total[grade - 'A']++;
            }
        }

        return Arrays.toString(total);
    }
}
