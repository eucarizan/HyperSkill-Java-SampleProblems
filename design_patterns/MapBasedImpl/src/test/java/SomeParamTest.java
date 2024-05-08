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
            "test1 ; 0 ; The Lord of the Rings ; 1 ; Pride and Prejudice ; 10 ; " +
                    "Found Book [id 0, title : The Lord of the Rings]|Not found id 10|Found Book [id 1, title : Pride and Prejudice]|Updated Book [id 1, title : UPDATED]|Deleted id: 1",
            "test2 ; 5 ; His Dark Materials ; 100 ; The Hitchhiker's Guide to the Galaxy ; 11 ; " +
                    "Found Book [id 5, title : His Dark Materials]|Not found id 11|Found Book [id 100, title : The Hitchhiker's Guide to the Galaxy]|Updated Book [id 100, title : UPDATED]|Deleted id: 100",
            "test3 ; 55555 ; Harry Potter and the Goblet of Fire ; 66666 ; To Kill a Mockingbird ; 22222 ; " +
                    "Found Book [id 55555, title : Harry Potter and the Goblet of Fire]|Not found id 22222|Found Book [id 66666, title : To Kill a Mockingbird]|Updated Book [id 66666, title : UPDATED]|Deleted id: 66666",
    }, delimiter = ';')
    public void test(String name, int id1, String title1, int id2, String title2, int find, String expectedStr) {
        Book book1 = new Book(id1, title1);
        Book book2 = new Book(id2, title2);
        BookDao bookDao = new BookDaoImpl();
        bookDao.add(book1);
        bookDao.add(book2);

        List<String> expected = Arrays.stream(expectedStr.split("\\|")).toList();
        var result = Solution.method(bookDao, book1, book2, find);

        assertEquals(expected, result);
    }
}
/*
55555
Harry Potter and the Goblet of Fire
66666
To Kill a Mockingbird
22222
 */