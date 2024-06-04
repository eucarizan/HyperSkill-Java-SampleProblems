import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        FromFile.textToArray();
        GetAnswer.getAnswer(1);
    }

    private static void spellCheck() {
        try (Scanner sc = new Scanner(System.in)) {
            long dictionarySize = Integer.parseInt(sc.nextLine());
            List<String> dictionary = sc.tokens()
                    .limit(dictionarySize)
                    .map(String::toLowerCase)
                    .toList();
            sc.nextLong();
            Set<String> words = sc.tokens()
                    .collect(Collectors.toCollection(LinkedHashSet::new));
//             Set<String> wordsFiltered = words.stream()
//                    .map(String::toLowerCase)
//                    .filter(java.util.function.Predicate.not(dictionary::contains))
//                    .collect(Collectors.toUnmodifiableSet());
            words.forEach(word -> {
                String wordLowerCase = word.toLowerCase();
                if (!dictionary.contains(wordLowerCase)) {
                    System.out.println(word);
                }
            });
            System.out.println(dictionary.toString().equals("asd"));
            System.out.println(words);
        }
    }

    private static void parseInput() {
        try (Stream<Path> paths = Files.walk(Paths.get("src/main/resources"))) {
            paths.filter(Files::isRegularFile).forEach(e -> {
                System.out.println("file: " + e.getFileName());
                try (Scanner sc = new Scanner(e)) {
                    int dictionarySize = Integer.parseInt(sc.nextLine());
                    List<String> dictionary = sc.tokens()
                            .limit(dictionarySize)
                            .toList();
                    List<String> words = new LinkedList<>();
                    sc.nextLine();
                    sc.nextLine();
                    while (sc.hasNextLine()) {
                        words.addAll(Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toCollection(LinkedList::new)));
                    }
                    System.out.println("  " + words);
                    System.out.println(toSet(words));
                    System.out.println("  " + dictionary);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println();
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static Set<String> toSet(List<String> str) {
//        String str = "cZdaYY ZP rsP d Zrs dPZsb PrbdYu aYYrb ZqduYYPs XYcrcXcr budZXqqrcP c dds ZdXXubbcus YP PY br qqdqbsccra uduZqYY uPsZabaXP ZdXXubbcus cZdaYY YXb YdYubbqraY Z u rrqbcaqPdP c qdd c u YdYubbqraY a Psbqrcrqbu qPuaPY rbda ZqduYYPs sXu uduZqYY YaadrqbYX bbb YaadrqbYX PYYuXddYY rrqbcaqPdP YXcsb ac cuccXrZ uruPdcZsZ bararYs XYdPs srdsubbXs uXZcbYduc sPPYqbr uduZqYY rcP srdsubbXs r cuccXrZ YqcXd dds aZPYqr uXZcbYduc daYYdr PrbdYu YXcsb cbbZqXdXu suqrsr sXsds rrqbcaqPdP qqdqbsccra uZsPXXscs Z YdYubbqraY YXcsb YP dPsq cbbZqXdXu rPs drqXbXbXdu csPq srdsubbXs rZ Yd rrqbcaqPdP qcbsccX r suqrsr rPs dds rZuZbZuaqX bYuZrsZqZq ra rabqZ br PrbdYu bYuZrsZqZq dds PYacY Ys bcd YXbqcbZP cuccXrZ YdYubbqraY scPaZuPsZZ ZdXXubbcus bccbdXr d usYrsaZPq adqdYPP qq rabqZ br qXZcadurs uqXbb uYaYccPb srdsubbXs";
//        Set<String> set = Arrays.stream(str.split(" "))
//                .collect(Collectors.toCollection(LinkedHashSet::new));
//        Set<String> set = new LinkedHashSet<>(str);
//        System.out.println("  to set:\n  " + set);
        return new LinkedHashSet<>(str);
    }


}