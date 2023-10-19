public class Solution {
    public static int sumUntilZero(int[] nums) {
        int sum = 0;
        int i = 0;

        while (nums[i] != 0) {
            sum += nums[i];
            i++;
        }

        return sum;
    }
}

/*
try (Scanner scanner = new Scanner(System.in)) {
    int num = scanner.nextInt();
    int sum = 0;
    while (num != 0) {
        sum += num;
        num = scanner.nextInt();
    }
    System.out.println(sum);
}
 */