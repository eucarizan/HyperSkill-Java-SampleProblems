import java.util.HashMap;
import java.util.Map;

public class BookDaoImpl implements BookDao{
    private final Map<Integer, Book> books;

    public BookDaoImpl() {
        this.books = new HashMap<>();
    }

    @Override
    public void add(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public Book get(int id) {
        return books.get(id);
    }

    @Override
    public void update(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public void delete(int id) {
        books.remove(id);
    }
}
