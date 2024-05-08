import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- {6}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 ; 0 ; John ; 1 ; Jack ; 10 ; " +
                    "Found User [id 0, name : John]|Not found id 10|Found User [id 1, name : Jack]|Updated User [id 1, name : UPDATED]|Deleted id: 1",
            "test2 ; 5 ; Administrator ; 100 ; Moderator ; 11 ; " +
                    "Found User [id 5, name : Administrator]|Not found id 11|Found User [id 100, name : Moderator]|Updated User [id 100, name : UPDATED]|Deleted id: 100",
            "test3 ; 55555 ; ShortName ; 66666 ; LongName ; 22222 ; " +
                    "Found User [id 55555, name : ShortName]|Not found id 22222|Found User [id 66666, name : LongName]|Updated User [id 66666, name : UPDATED]|Deleted id: 66666",
    }, delimiter = ';')
    public void test(String name, int id1, String name1, int id2, String name2, int find, String expectedStr) {
        User user1 = new User(id1, name1);
        User user2 = new User(id2, name2);
        UserDao userDao = new UserDaoImpl();
        userDao.add(user1);
        userDao.add(user2);

        List<String> expected = Arrays.stream(expectedStr.split("\\|")).toList();

        List<String> result = Solution.method(userDao, user1, user2, find);

        assertEquals(expected, result);
    }
}
