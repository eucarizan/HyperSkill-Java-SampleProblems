package dev.nj.solutions;

import java.util.List;
import java.util.Set;

public class SetSpellCheck {
    public static void getErroneous(List<String> dictionary, Set<String> words, Set<String> temp) {
        List<String> dictionaryLowerCase = dictionary.stream().map(String::toLowerCase).toList();
        temp.forEach(word -> {
            if (!dictionaryLowerCase.contains(word.toLowerCase())) {
                words.add(word);
            }
        });
    }
}
