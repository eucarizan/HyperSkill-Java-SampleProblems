import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testAnimal : Animal : ...An incomprehensible sound...",
            "testCat : Cat : meow-meow",
            "testDog : Dog : arf-arf",
            "testDuck : Duck : quack-quack",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        String result = Solution.method(param).say();

        assertEquals(expected, result);
    }
}
