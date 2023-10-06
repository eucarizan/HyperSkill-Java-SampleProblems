public class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {
    private final int step;

    public TakePersonsWithStepAlgorithm(int step) {
        this.step = step;
    }

    @Override
    public Person[] select(Person[] persons) {
        Person[] people = new Person[persons.length];
        int j = 0;
        for (int i = 0; i < persons.length; i++) {
            if (i % step == 0) {
                people[j++] = persons[i];
            }
        }
        return people;
    }
}
