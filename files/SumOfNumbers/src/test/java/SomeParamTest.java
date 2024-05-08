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
    void sumOfNumbersTest() {
        String path = "src/main/resources/dataset_91033_sum.txt";
        int result = Solution.getSum(path);

        assertEquals(25412, result);
    }
}
