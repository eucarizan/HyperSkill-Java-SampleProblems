import java.util.ArrayList;
import java.util.List;

public class RockStarGames implements Observable {
    public String releaseGame;
    private final List<Observer> observers = new ArrayList<>();

    public String release(String releaseGame) {
        this.releaseGame = releaseGame;
        return notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String notifyObservers() {
        StringBuilder sb = new StringBuilder();

        observers.forEach(observer -> {
            sb.append("Notification for gamer: ");
            sb.append(observer);
            sb.append("\n");
            sb.append(observer.update(releaseGame));
        });

        return sb.toString();
    }
}
