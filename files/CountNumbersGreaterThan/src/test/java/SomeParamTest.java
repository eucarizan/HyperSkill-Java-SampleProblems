import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @Test
    void countGreaterThanTest() {
        String path = "src/main/resources/dataset_91022_countGreater.txt";
        int result = Solution.countGreaterThan(path, 9999);

        assertEquals(9899, result);
    }
}
