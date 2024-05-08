import java.util.HashSet;
import java.util.Set;

public class Gamer implements Observer {
    private final String name;
    private final Set<String> games = new HashSet<>();

    public Gamer(String name) {
        this.name = name;
    }

    @Override
    public String update(String game) {
        if (games.contains(game)) {
            return "What? They've already released this game ... I don't understand\n";
        } else {
            return buyGame(game);
        }
    }

    public String buyGame(String game) {
        games.add(game);

        return name +
                " says: \"Oh, Rockstar releases new game " +
                game +
                "!\"\n";
    }

    @Override
    public String toString() {
        return name;
    }
}
