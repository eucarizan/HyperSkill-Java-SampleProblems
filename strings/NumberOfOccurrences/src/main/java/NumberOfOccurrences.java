public class NumberOfOccurrences {
    public static int frequency(String word, String subString) {
        if (word.isEmpty() || subString.isEmpty()) {
            return 0;
        }

        int count = 0;

        while (word.contains(subString)) {
            word = word.replaceFirst(subString, "");
            count++;
        }

        return count;
    }
}
