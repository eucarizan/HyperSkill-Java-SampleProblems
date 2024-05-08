import java.util.Arrays;

public class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {
    private final int count;

    public TakeLastPersonsAlgorithm(int count) {
        this.count = count;
    }

    @Override
    public Person[] select(Person[] persons) {
        Person[] people = new Person[count];
        int from = persons.length - count;
        return Arrays.copyOfRange(persons, from, persons.length);
    }
}
