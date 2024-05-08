public class Solution {
    private static final char[] UPPER_CASE = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] LOWER_CASE = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] NUMS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    private static int count;

    public static String method(int a, int b, int c, int n) {
        count = 0;
        String remaining;
        String start = appendChars(a, UPPER_CASE) +
                appendChars(b, LOWER_CASE) +
                appendChars(c, NUMS);

        if (b == 0 && c == 0) {
            remaining = appendChars(n - count, LOWER_CASE);
        } else {
            remaining = appendChars(n - count, UPPER_CASE);
        }

        return start + remaining;
    }

    private static String appendChars(int limit, char[] array) {
        StringBuilder sb = new StringBuilder();
        int temp = limit;

        while (temp > 0) {
            for (int i = 0; i < Math.min(temp, array.length); i++) {
                sb.append(array[i]);
                count++;
            }
            temp -= array.length;
        }

        return sb.toString();
    }

    public static String shortcut(int a, int b, int c, int n) {
        count = 0;
        return appendCharsShort(a, new char[]{'A', 'B'}) +
                appendCharsShort(b, new char[]{'a', 'b'}) +
                appendCharsShort(c, new char[]{'1', '2'}) +
                appendCharsShort(n - count, new char[]{'X', 'Y'});
    }

    private static String appendCharsShort(int limit, char[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < limit / 2; i++) {
            sb.append(array[0]).append(array[1]);
            count += 2;
        }

        if (limit % 2 != 0) {
            sb.append(array[0]);
            count++;
        }

        return sb.toString();
    }
}
