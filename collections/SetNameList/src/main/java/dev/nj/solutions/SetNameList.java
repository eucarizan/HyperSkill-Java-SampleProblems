package dev.nj.solutions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class SetNameList {
    public static String setList(String str) {
         return Arrays.stream(str.split(","))
                .collect(Collectors.toCollection(LinkedHashSet::new)).toString();
//        return Arrays.stream(str.split(","))
//                .collect(Collectors.toCollection(LinkedHashSet::new))
//                .toString()
//                .replaceAll("(\\[|]|\\s)", "");
    }
}
