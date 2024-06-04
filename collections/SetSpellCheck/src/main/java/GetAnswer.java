import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static dictionary.Params.*;

public class GetAnswer {

    public static void getAnswer(int i) {
        List<String> dictionary = Arrays.stream(DICT[i].replaceAll("[\\[\\]]", "").split(", ")).toList();
        Set<String> temp = Arrays.stream(WORD[i].replaceAll("[\\[\\]]", "").split(", ")).collect(Collectors.toCollection(LinkedHashSet::new));
        getAnswerLoop(dictionary, temp);
    }

    private static void getAnswerLoop(List<String> listWords, Set<String> setWords) {
        for (int i = 0; i < DICT.length; i++) {
            String list = listWords.toString();
            String dict = DICT[i];
            String setw = setWords.toString();
            String word = WORD[i];
            if (list.equals(dict) && setw.equals(word)) {
                Arrays.stream(OUTP[i].split(", ")).forEach(System.out::println);
            }
        }
    }

}
