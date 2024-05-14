package dev.nj.solutions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencies {
    public static Map<Integer, Long> displayCount(List<Integer> nums) {
        return nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
