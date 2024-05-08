import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static String startsOrEnds(String text, String param) {
        String regex = String.format("([a-zA-Z]*%s\\b)|(\\b%s[a-zA-Z]*)", text, text);
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(param);
        return matcher.find() ? "YES" : "NO";
    }
}
