import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static int getMaxPopulation(String path) {
        File file = new File(path);
        try (Stream<String> lines = Files.lines(Paths.get(file.toURI()))) {
            Map<Integer, Long> yearPopulation = lines
                    .skip(1)
                    .map(s -> s.split("\\s+"))
                    .collect(Collectors.toMap(
                            p -> Integer.parseInt(p[0]),
                            p -> Long.parseLong(p[1].replaceAll(",", ""))));

//            return getYear(yearPopulation);
            return yearPopulation
                    .entrySet()
                    .stream()
                    .skip(1)
                    .max(Comparator.comparing(e -> e.getValue() - yearPopulation.get(e.getKey() - 1)))
                    .map(Map.Entry::getKey)
                    .orElse(0);
        } catch (IOException e) {
            return -1;
        }
    }

    private static int getYear(Map<Integer, Long> yearPopulation) {
        int year = 0;
        Map.Entry<Integer, Long> previous = null;
        long increase = 0;

        for (Map.Entry<Integer, Long> e : yearPopulation.entrySet()) {
            if (previous != null) {
                long currentIncrease = e.getValue() - previous.getValue();
                if (currentIncrease > increase) {
                    increase = currentIncrease;
                    year = e.getKey();
                }
            }
            previous = e;
        }
        return year;
    }
}
