public class Solution {
    public static double averageOfDivisibleBy3FromTo(int start, int end) {
        int sum = 0;
        int count = 0;

        while (start % 3 != 0) {
            start++;
        }

        for (int i = start; i <= end ; i+=3) {
            sum += i;
            count++;
        }

        return (sum * 1.0) / (count == 0 ? 1 : count);
    }
}
