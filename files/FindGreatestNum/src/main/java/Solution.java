import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Solution {
    public static int findMaxNum(String path) {
        File file = new File(path);
        try (Stream<String> lines = Files.lines(Paths.get(file.toURI()))) {
            return lines
                    .flatMap(s -> Stream.of(s.split(" ")))
                    .map(Integer::parseInt)
                    .max(Integer::compareTo)
                    .orElse(0);
        } catch (IOException e) {
            return -1;
        }
    }
}
