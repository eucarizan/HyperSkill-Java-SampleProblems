import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Solution {
    public static int countEven(String path) {
        File file = new File(path);
        Predicate<Integer> filter = a -> a % 2 == 0;
        Predicate<Integer> takeFilter = a -> a > 0;

        try (Stream<String> lines = Files.lines(Paths.get(file.toURI()))) {
            return (int) lines
                    .map(Integer::parseInt)
                    .filter(filter)
                    .takeWhile(takeFilter)
                    .count();
        } catch (IOException e) {
            return -1;
        }
    }
}
