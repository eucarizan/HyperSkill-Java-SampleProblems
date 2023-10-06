import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeParamTest {

    @Test
    void testTakePersonsWithStepAlgorithmSinglePerson() {
        Person[] persons = {new Person("Alice")};
        SelectionContext context = new SelectionContext();
        context.setAlgorithm(new TakePersonsWithStepAlgorithm(1));
        Person[] selectedPersons = context.selectPersons(persons);

        assertEquals(1, selectedPersons.length);
        assertEquals("Alice", selectedPersons[0].getName());
    }

    @Test
    void testTakeLastPersonsWithSinglePerson() {
        Person[] persons = {new Person("Alice")};
        SelectionContext context = new SelectionContext();
        context.setAlgorithm(new TakeLastPersonsAlgorithm(1));
        Person[] selectedPersons = context.selectPersons(persons);

        assertEquals(1, selectedPersons.length);
        assertEquals("Alice", selectedPersons[0].getName());
    }

    @Test
    void testTakePersonsWithStepAlgorithmMultiplePersons() {
        Person[] persons = {
                new Person("Alice"),
                new Person("Bob"),
                new Person("Charlie"),
                new Person("David"),
                new Person("Eve")
        };

        SelectionContext context = new SelectionContext();
        context.setAlgorithm(new TakePersonsWithStepAlgorithm(2));
        Person[] selectedPersons = context.selectPersons(persons);

        assertEquals("Alice", selectedPersons[0].name);
        assertEquals("Charlie", selectedPersons[1].name);
        assertEquals("Eve", selectedPersons[2].name);
    }

    @Test
    void testTakeLastPersonsWithMultiplePersons() {
        Person[] persons = {
                new Person("Alice"),
                new Person("Bob"),
                new Person("Charlie"),
                new Person("David"),
                new Person("Eve")
        };

        SelectionContext context = new SelectionContext();
        context.setAlgorithm(new TakeLastPersonsAlgorithm(3));
        Person[] selectedPersons = context.selectPersons(persons);

        assertEquals("Charlie", selectedPersons[0].name);
        assertEquals("David", selectedPersons[1].name);
        assertEquals("Eve", selectedPersons[2].name);
    }
}
