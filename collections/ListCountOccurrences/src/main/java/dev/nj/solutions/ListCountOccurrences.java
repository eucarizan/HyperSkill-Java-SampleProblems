package dev.nj.solutions;

import java.util.List;

public class ListCountOccurrences {
    public static boolean checkTheSameNumberOfTimes(int num, List<Integer> nums1, List<Integer> nums2) {
        return nums1.stream().filter(n -> num == n).count()
                == nums2.stream().filter(n -> n == num).count();
    }
}
