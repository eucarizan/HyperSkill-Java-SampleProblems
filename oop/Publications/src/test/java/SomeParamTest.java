import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeParamTest {

    @Test
    void testPublication() {
        String result = Solution.method("Publication", "The new era", "").getDetails();

        assertEquals("title=\"The new era\"", result);
    }

    @Test
    void testNewspaper() {
        String result = Solution.method("Newspaper", "Football results", "Sport news").getDetails();

        assertEquals("title=\"Football results\", source=\"Sport news\"", result);
    }

    @Test
    void testArticle() {
        String result = Solution.method("Article", "Why the Sun is hot", "Dr James Smith").getDetails();

        assertEquals("title=\"Why the Sun is hot\", author=\"Dr James Smith\"", result);
    }

    @Test
    void testAnnouncement() {
        String result = Solution.method("Announcement", "Will sell a house", "30").getDetails();

        assertEquals("title=\"Will sell a house\", daysToExpire=30", result);
    }
}
