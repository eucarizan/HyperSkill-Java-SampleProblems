public class CompareStrings {
    public static boolean isEquals(String word1, String word2) {
        return word1.replaceAll("\\s+", "")
                .equalsIgnoreCase(word2.replaceAll("\\s+", ""));
    }
}
