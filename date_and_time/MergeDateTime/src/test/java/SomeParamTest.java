import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- mergeToMaxDate({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testValidDateTime ; " +
                    "2018-10-20T22:30 ; 2017-12-30T22:31:45 ; 2018-12-30T22:31:45",
            "testMaxDateTimeWithEqualDatesTimes ; " +
                    "2023-9-7T12:30:15 ; 2023-9-7T12:30:15 ; 2023-9-7T12:30:15",
            "testMaxDateTimeWithDifferentDatesSameTime ; " +
                    "2023-9-7T12:30:15 ; 2024-9-15T12:30:15 ; 2024-9-15T12:30:15",
            "testMaxDateTimeWithSameDateDifferentTimes ; " +
                    "2024-9-15T12:30:15 ; 2024-9-15T14:45:10 ; 2024-9-15T15:45:15",
    }, delimiter = ';')
    public void test(String name, LocalDateTime input1, LocalDateTime input2, LocalDateTime expected) {
        LocalDateTime result = Merge.maxDateTime(input1, input2);

        assertEquals(expected, result);
    }
}
