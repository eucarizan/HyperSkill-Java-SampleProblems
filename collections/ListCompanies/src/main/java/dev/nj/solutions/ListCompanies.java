package dev.nj.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListCompanies {
    public static String companyToList(String str) {
        List<String> list = Arrays.stream(str.split(" ")).toList();
        // return list.stream().collect(Collectors.joining(", ", "[", "]"));
        return list.toString();
    }
}
