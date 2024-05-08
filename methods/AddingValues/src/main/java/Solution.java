public class Solution {
    public static void addValueByIndex(long[] arr, int idx, long value) {
        if (idx >= 0 && idx <= arr.length) {
            arr[idx] += value;
        }
    }
}
