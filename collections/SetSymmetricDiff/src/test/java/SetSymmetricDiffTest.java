import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.SetSymmetricDiff;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class SetSymmetricDiffTest {

    @ParameterizedTest(name = "{0} -- symmetricDifference([{1}], [{2}]) == {3}")
    @DisplayName("symmetricDifference test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 0, 1, 2 : 0 3",
    }, delimiter = ':')
    public void test(String name, String input1, String input2, String expected) {
        Set<String> param1 = Arrays.stream(input1.split(", ")).collect(Collectors.toSet());
        Set<String> param2 = Arrays.stream(input2.split(", ")).collect(Collectors.toSet());

        var result = SetSymmetricDiff.symmetricDifference(param1, param2);

        assertEquals(expected, result);
    }
}
