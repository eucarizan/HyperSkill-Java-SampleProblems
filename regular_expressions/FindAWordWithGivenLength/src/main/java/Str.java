import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str {
    public static String hasWordWithLength(int len, String text) {
        String regex = "\\b[a-zA-Z]{" + len + "}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.find() ? "YES" : "NO";
    }
}
