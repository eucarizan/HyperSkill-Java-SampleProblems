package dev.nj.solutions;

import java.util.Collection;

public class CollectionUtils {
    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        return numbers.stream().map(e -> e * e).toList();
    }
}
