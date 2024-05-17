package dev.nj.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEvenFilter {
    public static List<Integer> filterList(List<Integer> nums) {
        List<Integer> numsOut = new ArrayList<>();
        List<Integer> reverseOut = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 != 0) {
                numsOut.add(nums.get(i));
            }
        }

        for (int i = numsOut.size() - 1; i >= 0; i--) {
            reverseOut.add(numsOut.get(i));
        }

        return reverseOut;
    }
}
