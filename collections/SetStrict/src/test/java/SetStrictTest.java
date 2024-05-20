import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.SetStrict;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SetStrictTest {

    @ParameterizedTest(name = "{0} -- isStrictSuperset([{1}], [{2}]) == {3}")
    @DisplayName("isStrictSuperset test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 4, 1, 2, 3 : true",
            "test2 : b, a, c : e, c, d, b : false",
            "test3 : a, b, c : c, b, a : false"
    }, delimiter = ':')
    public void test(String name, String input1, String input2, boolean expected) {
        Set<String> param1 = readStringSet(input1);
        Set<String> param2 = readStringSet(input2);
        
        var result = SetStrict.isStrictSuperset(param1, param2);

        assertEquals(expected, result);
    }

    private static Set<String> readStringSet(String input) {
        return Arrays.stream(input.split(", "))
                .collect(Collectors.toSet());
    }
}
