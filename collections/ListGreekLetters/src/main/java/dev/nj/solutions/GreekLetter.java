package dev.nj.solutions;

public class GreekLetter {
    private final String letter;
    private final Integer position;

    public GreekLetter(String letter, Integer position) {
        this.letter = letter;
        this.position = position;
    }

    @Override
    public String toString() {
        return "{" +
                "letter='" + letter + '\'' +
                ", position=" + position +
                '}';
    }
}
