import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.CollectionUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class CollectionUtilsTest {

    @ParameterizedTest(name = "{0} -- pow2({1}) == {2}")
    @DisplayName("pow2 test")
    @CsvSource(value = {
            "test1 : 10, 20, -5 : [100, 400, 25]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<Integer> param = Arrays.stream(input.split(", ")).map(Integer::parseInt).toList();

        var result = CollectionUtils.pow2(param).toString();

        assertEquals(expected, result);
    }
}
