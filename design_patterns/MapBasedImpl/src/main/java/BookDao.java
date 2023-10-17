public interface BookDao {

    void add(Book book);

    Book get(int id);

    void update(Book book);

    void delete(int id);
}
