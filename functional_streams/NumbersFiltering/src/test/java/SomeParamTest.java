import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeParamTest {

    @ParameterizedTest(name = "given {0}, when sorted and skipped 2 and is divisible by 3 and 5, then {1}")
    @CsvSource(value = {
            "1 2 3 4:[]",
            "30 75 60 90:[75, 90]"
    }
            , delimiter = ':')
    public void test(String input, String expected) {
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .toList();

        assertEquals(expected, EvenAndOddFilter.test(numbers).toString());
    }

    @Test
    @DisplayName("given many input, when processed, then expect filtered")
    public void test2() {
        String input = "200 199 198 197 196 195 194 193 192 191 190 189 188 187 186 185 184 183 182 181 180 179 178 177 176 175 174 173 172 171 170 169 168 167 166 165 164 163 162 161 160 159 158 157 156 155 154 153 152 151 150 149 148 147 146 145 144 143 142 141 140 139 138 137 136 135 134 133 132 131 130 129 128 127 126 125 124 123 122 121 120 119 118 117 116 115 114 113 112 111 110 109 108 107 106 105 104 103 102 101 100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76 75 74 73 72 71 70 69 68 67 66 65 64 63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2";
        String expected = "[45, 60, 75, 90, 105, 120, 135, 150, 165, 180, 195]";

        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .toList();

        assertEquals(expected, EvenAndOddFilter.test(numbers).toString());
    }
}
