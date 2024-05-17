package dev.nj.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ListEvenFilter {
    public static List<Integer> filterList(List<Integer> nums) {
        List<Integer> out = new ArrayList<>(nums);
        out.removeIf(e -> nums.indexOf(e) % 2 == 0);
        Collections.reverse(out);
        return out;
    }

    public static String filterListIntStream(String[] input) {
        return IntStream.range(0, input.length)
                .filter(i -> (i & 1) != 0)
                .mapToObj(i -> input[i])
                .reduce((l, r) -> r + " " + l)
                .orElse("");
    }
}
