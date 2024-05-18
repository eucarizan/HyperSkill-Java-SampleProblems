package dev.nj.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListSplitSublist {
    public static <T> List<List<T>> splitListIntoSublists(List<T> list, int subListSize) {
        List<List<T>> sublist = new ArrayList<>();
        int idx = 0;

        while (idx < list.size()) {
            List<T> temp = new ArrayList<>();
            for (int j = 0; j < subListSize && idx < list.size(); j++) {
                temp.add(list.get(idx++));
            }
            sublist.add(temp);
        }

        return sublist;
    }

    public static <T> List<List<T>> splitLIstIntoSublistsStream(List<T> list, int size) {
        return IntStream
                .iterate(0, i -> i < list.size(), i -> i + size)
                .mapToObj(i -> list.subList(i, Math.min(i + size, list.size())))
                .collect(Collectors.toList());
    }
}
