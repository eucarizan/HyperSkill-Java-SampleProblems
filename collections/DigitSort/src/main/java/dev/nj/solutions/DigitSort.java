package dev.nj.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitSort {
    public static List<Integer> convertToList(int number) {
        // List<Integer> out = new ArrayList<>();
        // while (number > 0) {
            // out.add(number%10);
            // number/=10;
        // }
        // return out.stream().sorted().toList();
        return convertToListOneLine(number);
    }

    private static List<Integer> convertToListOneLine(int number) {
        return new ArrayList<>(Arrays
                .stream(String.valueOf(number).split(""))
                .map(Integer::parseInt)
                .sorted()
                .toList());
    }
}
