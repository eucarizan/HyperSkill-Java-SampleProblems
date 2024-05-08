import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of(
                "The    keY    is     ggYYY3564   THE    key IS ffFF23c! ",
                "The    key    IS     ggYiYY3564   The    KEY  is     AAAAAaaaa!!! ",
                "blabla ggYiYY3564 The    key    IS iiiaaaasd!  The    key    IS ffPPP23c! The    key    IS   ffFF23c ",
                "The    keY    is ????? blabla ",
                "blabla The    key    IS     aaaa54 blabla  The    KEY  is     !!fra The    KEY  is aeou# ",
                "blabla The    key    IS     ggg! blabla  The    KEY  is     yyyaa! blabla The    KEY  is FGH ",
                "blabla The    key    IS     ggg blabla  The    KEY  is     eeeeeaa blabla The    KEY  is FGH4673846 ",
                "The    keY    is aaa?????xxx blabla The    key    IS     1154 "
        );

        Pattern pattern = Pattern.compile("(the\\s+key\\s+is\\s+)" +
                "([\\dbcdfghjklmnpqrstvwxyz]+|[?!#aeiou]+)" +
                "(\\s|\\n)", Pattern.CASE_INSENSITIVE);

        list.forEach(s -> findKeys(s, pattern));
    }

    private static void findKeys(String text, Pattern pattern) {
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group(2).trim() + " ");
        }
        System.out.println();
    }
}