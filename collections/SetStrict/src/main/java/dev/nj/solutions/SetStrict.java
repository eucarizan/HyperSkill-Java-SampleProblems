package dev.nj.solutions;

import java.util.Set;

public class SetStrict {
    public static <T> boolean isStrictSuperset(Set<T> set1, Set<T> set2) {
        if (!set1.equals(set2)) {
            return set2.containsAll(set1);
        }
        return false;
    }
}
