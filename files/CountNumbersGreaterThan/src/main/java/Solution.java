import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Solution {
    public static int countGreaterThan(String path, int max) {
        File file = new File(path);

        try (Stream<String> lines = Files.lines(Paths.get(file.toURI()))) {
            return (int) lines.flatMap(s -> Stream.of(s.split(" ")))
                    .map(Integer::parseInt)
                    .filter(s -> s >= max)
                    .count();
        } catch (IOException e) {
            return -1;
        }
    }
}
