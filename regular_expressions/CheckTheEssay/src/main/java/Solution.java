import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static List<String> findTheKeys(String text) {
        List<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile("(the\\s+key\\s+is\\s+)" +
                "([\\dbcdfghjklmnpqrstvwxyz]+|[?!#aeiou]+)" +
                "(\\s|\\n)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            list.add(matcher.group(2).trim());
        }

        return list;
    }
}
