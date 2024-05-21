package dev.nj.solutions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SetRemove {
    public static Set<Integer> getSetFromString(String str) {
        return Arrays.stream(str.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(e -> e > 10);
    }
}
