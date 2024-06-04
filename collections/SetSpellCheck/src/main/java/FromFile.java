import dev.nj.solutions.SetSpellCheck;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static dictionary.Params.*;

public class FromFile {

    public static void textToArray() {
        try (Stream<Path> paths = Files.walk(Paths.get("src/main/resources"))) {
            String[] dictionary = new String[11];
            String[] words = new String[11];
            AtomicInteger i = new AtomicInteger();

            paths.filter(Files::isRegularFile).forEach(e -> addToConstant(e, dictionary, words, i.getAndIncrement()));

            String dict = Arrays.stream(dictionary).filter(Objects::nonNull).collect(Collectors.joining("\", \n        \""));
            String word = Arrays.stream(words).filter(Objects::nonNull).collect(Collectors.joining("\", \n        \""));

            System.out.println("    private static final String[] DICT = {\n        \"" + dict + "\"\n    };");
            System.out.println("    private static final String[] WORD = {\n        \"" + word + "\"\n    };");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        getOutput();
    }

    private static void addToConstant(Path path, String[] dictionary, String[] words, int idx) {
        try (Scanner sc = new Scanner(path)) {
            int dictionarySize = Integer.parseInt(sc.nextLine());
            List<String> dictionaryString = sc.tokens()
                    .limit(dictionarySize)
                    .toList();
            Set<String> wordsString = new LinkedHashSet<>();
            sc.nextLine();
            sc.nextLine();
            while (sc.hasNextLine()) {
                wordsString.addAll(Arrays.stream(sc.nextLine().split(" "))
                        .collect(Collectors.toCollection(LinkedList::new)));
            }
            dictionary[idx] = dictionaryString.toString();
            words[idx] = wordsString.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getOutput() {
        String[] output = new String[15];
        for (int i = 0; i < DICT.length; i++) {
            Set<String> words = new LinkedHashSet<>();
            List<String> dictionary = Arrays.stream(DICT[i].replaceAll("[\\[\\]]", "").split(", ")).toList();
            Set<String> temp = Arrays.stream(WORD[i].replaceAll("[\\[\\]]", "").split(", ")).collect(Collectors.toCollection(LinkedHashSet::new));
            SetSpellCheck.getErroneous(dictionary, words, temp);
            output[i] = words.toString().replaceAll("[\\[\\]]", "");
        }

        String out = Arrays.stream(output).filter(Objects::nonNull).collect(Collectors.joining("\", \n        \""));

        System.out.println("    private static final String[] OUTP = {\n        \"" + out + "\"\n    };");
    }
}
