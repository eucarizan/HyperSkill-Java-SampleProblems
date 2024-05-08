import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @Test
    void testWithReleaseSingleGame() {
        String expected = """
                Notification for gamer: Garry Rose
                Garry Rose says: "Oh, Rockstar releases new game GTA 5!"
                Notification for gamer: Peter Johnston
                Peter Johnston says: "Oh, Rockstar releases new game GTA 5!"
                Notification for gamer: Helen Jack
                Helen Jack says: "Oh, Rockstar releases new game GTA 5!"
                """;

        List<Gamer> gamers = List.of(
                new Gamer("Garry Rose"),
                new Gamer("Peter Johnston"),
                new Gamer("Helen Jack")
        );

        List<String> games = List.of("GTA 5");

        String result = Solution.method(gamers, games);

        assertEquals(expected, result);
    }

    @Test
    void testWithDuplicateGames() {
        String expected = """
                Notification for gamer: Garry Rose
                Garry Rose says: "Oh, Rockstar releases new game GTA 5!"
                Notification for gamer: Peter Johnston
                Peter Johnston says: "Oh, Rockstar releases new game GTA 5!"
                Notification for gamer: Helen Jack
                Helen Jack says: "Oh, Rockstar releases new game GTA 5!"
                Notification for gamer: Garry Rose
                What? They've already released this game ... I don't understand
                Notification for gamer: Peter Johnston
                What? They've already released this game ... I don't understand
                Notification for gamer: Helen Jack
                What? They've already released this game ... I don't understand
                """;

        List<Gamer> gamers = List.of(
                new Gamer("Garry Rose"),
                new Gamer("Peter Johnston"),
                new Gamer("Helen Jack")
        );

        List<String> games = List.of("GTA 5", "GTA 5");

        String result = Solution.method(gamers, games);

        assertEquals(expected, result);
    }
}
