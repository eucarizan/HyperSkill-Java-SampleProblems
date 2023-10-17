import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> method(BookDao bookDao, Book book1, Book book2, int id) {
        List<String> list = new ArrayList<>();

        list.add("Found " + bookDao.get(book1.getId()));

        list.add("Not found id " + id);

        Book updateUser = bookDao.get(book2.getId());
        list.add("Found " + updateUser);
        updateUser.setTitle("UPDATED");
        bookDao.update(updateUser);
        list.add("Updated " + bookDao.get(book2.getId()));

        bookDao.delete(book2.getId());
        if (bookDao.get(book2.getId()) == null) {
            list.add("Deleted id: " + book2.getId());
        }

        return list;
    }
}
