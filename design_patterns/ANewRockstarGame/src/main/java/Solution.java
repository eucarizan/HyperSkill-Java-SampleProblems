import java.util.List;

public class Solution {
    public static String method(List<Gamer> gamers, List<String> games) {
        StringBuilder sb = new StringBuilder();
        RockStarGames rockStarGames = new RockStarGames();
        gamers.forEach(rockStarGames::addObserver);

        games.forEach(game -> sb.append(rockStarGames.release(game)));

        return sb.toString();
    }
}