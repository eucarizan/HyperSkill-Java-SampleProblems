import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeParamTest {

    @Test
    public void getYearLargestIncreaseTest() {
        String path = "src/main/resources/dataset_91069_yearLargestPopulation.txt";
        var result = Solution.getMaxPopulation(path);

        assertEquals(1990, result);
    }
}
