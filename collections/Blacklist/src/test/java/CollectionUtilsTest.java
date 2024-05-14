import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.CollectionUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class CollectionUtilsTest {

    @ParameterizedTest(name = "{0} -- filterPhones({1}, [{2}]) == {3}")
    @DisplayName("filterPhones test")
    @CsvSource(value = {
            "test1 : 505-468-5235 : 387-968-2999, 505-468-5235, 739-738-3272 : [387-968-2999, 739-738-3272]",
    }, delimiter = ':')
    public void test(String name, String input2, String input, String expected) {
        List<String> param = Arrays.stream(input.split(", ")).toList();
        List<String> blacklist = Arrays.stream(input2.split(", ")).toList();

        var result = CollectionUtils.filterPhones(param, blacklist).toString();

        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        List<String> nums = List.of("387-968-2999", "505-468-5235", "739-738-3272");
        List<String> numbers = new ArrayList<>(nums);
        List<String> blacklist = List.of("505-468-5235");

        assertEquals("[387-968-2999, 739-738-3272]",
                CollectionUtils.filterPhonesCollectionRemove(numbers, blacklist).toString());
    }
}
