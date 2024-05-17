package dev.nj.solutions;

import java.util.List;
import java.util.stream.Collectors;

public class ListGreekLetters {
    public static String printLetters(List<GreekLetter> letterList) {
        return letterList.stream().map(GreekLetter::toString).collect(Collectors.joining("; "));
    }
}
