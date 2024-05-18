package dev.nj.solutions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListLongestString {
    public static void changeList(List<String> list) {
        String longest = list.stream()
                .max(Comparator.comparing(String::length))
                .orElse("");
        Collections.fill(list, longest);
    }
}
