package dev.nj.solutions;

import java.util.List;
import java.util.stream.IntStream;

public class ListMiddleElement {
    public static int getMiddle(int num) {
        List<Integer> nums = IntStream.rangeClosed(1, num).boxed().toList();
        int mid = nums.get(num / 2);
        return nums.size() % 2 != 0 ? mid : (mid + nums.get(num / 2 - 1)) / 2;
    }
}
