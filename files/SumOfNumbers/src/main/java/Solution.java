import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Solution {
    public static int getSum(String path) {
        File file = new File(path);
        try (Stream<String> lines = Files.lines(Paths.get(file.toURI()))) {
            return lines
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);
        } catch (IOException e) {
            return -1;
        }
    }
}
