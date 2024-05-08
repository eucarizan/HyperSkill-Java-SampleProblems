public class WordThe {
    public static int firstOccurrence(String sentence) {
        if (!sentence.isEmpty()) {
            return sentence.toLowerCase().indexOf("the");
        }
        return -1;
    }
}
