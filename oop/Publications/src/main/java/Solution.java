public class Solution {
    public static Publication method(String publicationType, String title, String input) {
        return switch (publicationType.toLowerCase()) {
            case "newspaper" -> new Newspaper(title, input);
            case "article" -> new Article(title, input);
            case "announcement" -> new Announcement(title, Integer.parseInt(input));
            default -> new Publication(title);
        };
    }
}
