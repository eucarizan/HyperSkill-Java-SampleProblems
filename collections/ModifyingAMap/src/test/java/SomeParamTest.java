import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- mapShare({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWithValid : a|aaa, b|bbb, c|ccc : {a=aaa, b=aaa}",
            "testWithValid : a|xyz, b|123, c|456 : {a=xyz, b=xyz}",
            "testWithValid : x|xxx, y|yyy, z|zzz : {b=null, x=xxx, y=yyy, z=zzz}",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        Map<String, String> param = Arrays.stream(input.split(", "))
                .map(s -> s.split("\\|"))
                .collect(Collectors.toMap(part -> part[0], part -> part[1]));

        String result = Solution.mapShare(param);

        assertEquals(expected, result);
    }
}
