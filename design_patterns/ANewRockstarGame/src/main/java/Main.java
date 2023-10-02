import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gamer> gamers = List.of(
                new Gamer("Garry Rose"),
                new Gamer("Peter Johnston"),
                new Gamer("Helen Jack")
        );

        List<String> games = List.of("GTA 5", "GTA 5");

        System.out.println(Solution.method(gamers, games));
    }
}