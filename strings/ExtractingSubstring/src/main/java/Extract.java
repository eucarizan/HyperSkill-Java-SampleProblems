public class Extract {
    public static String substring(String word, int idx1, int idx2) {
        if (word.isEmpty()) {
            return "";
        }

        if (idx1 < 0 && idx2 < 0) {
            return word.substring(word.length() + idx1, word.length() + idx2);
        }

        idx1 = Math.max(idx1, 0);
        idx2 = Math.min(idx2, word.length() - 1);

        return word.substring(idx1, idx2 + 1);
    }
}
