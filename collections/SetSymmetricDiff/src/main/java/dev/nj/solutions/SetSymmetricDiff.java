package dev.nj.solutions;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetSymmetricDiff {
    public static String symmetricDifference(Set<String> set1, Set<String> set2) {
        Set<String> resultSet = new TreeSet<>();
        set1.forEach(e -> {
            if (!set2.contains(e)) {
                resultSet.add(e);
            }
        });
        set2.forEach(e -> {
            if (!set1.contains(e)) {
                resultSet.add(e);
            }
        });
        return String.join(" ", resultSet);
    }
}
