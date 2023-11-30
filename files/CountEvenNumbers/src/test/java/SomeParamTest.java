import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeParamTest {

    @Test
    void countEvenTest() {
        String path = "src/main/resources/dataset_91065_countEven.txt";
        int result = Solution.countEven(path);
        assertEquals(191, result);
    }
}
