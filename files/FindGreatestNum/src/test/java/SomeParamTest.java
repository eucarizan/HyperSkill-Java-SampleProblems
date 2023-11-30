import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeParamTest {

    @Test
    public void findMaxNumTest() {
        String path = "src/main/resources/dataset_91007_findMax.txt";
        var result = Solution.findMaxNum(path);

        assertEquals(999990, result);
    }
}
