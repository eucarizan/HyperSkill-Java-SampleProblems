import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}, {2}, {3}, {4}) == {5}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testSingleUppercase : 1 : 0 : 0 : 1 : A",
            "testSingleLowercase : 0 : 1 : 0 : 1 : a",
            "testSingleDigit : 0 : 0 : 1 : 1 : 1",
            "testWithUppercaseOnly : 10 : 0 : 0 : 10 : ABCDEFGHIJ",
            "testWithLowercaseOnly : 0 : 10 : 0 : 10 : abcdefghij",
            "testWithDigitsOnly : 0 : 0 : 10 : 10 : 1234567890",
            "testWithEqualMix : 5 : 5 : 5 : 15 : ABCDEabcde12345",
            "testWithZeroLength : 0 : 0 : 0 : 0 : ''",
            "testWithLargeNumbers : 100 : 100 : 100 : 300 : ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuv1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890",
            "testWithUppercaseNonConsecutive : 1 : 0 : 0 : 2 : Aa",
            "testWithLowercaseNonConsecutive : 0 : 1 : 0 : 2 : aA",
            "testWithDigitNonConsecutive : 0 : 0 : 1 : 2 : 1A",
            "testWithUppercaseAlphabetLimit : 27 : 0 : 0 : 27 : ABCDEFGHIJKLMNOPQRSTUVWXYZA",
            "testWithLowercaseAlphabetLimit : 0 : 27 : 0 : 27 : abcdefghijklmnopqrstuvwxyza",
            "testWithDigitsLimit : 0 : 0 : 11 : 11 : 12345678901",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, int n, String expected) {
        var result = Solution.method(a, b, c, n);

        assertEquals(expected, result);
    }
}
