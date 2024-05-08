import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> method(UserDao userDao, User user1, User user2, int id) {
        List<String> list = new ArrayList<>();

        list.add("Found " + userDao.get(user1.getId()));

        list.add("Not found id " + id);

        User updateUser = userDao.get(user2.getId());
        list.add("Found " + updateUser);
        updateUser.setName("UPDATED");
        userDao.update(updateUser);
        list.add("Updated " + userDao.get(user2.getId()));

        userDao.delete(user2.getId());
        if (userDao.get(user2.getId()) == null) {
            list.add("Deleted id: " + user2.getId());
        }

        return list;
    }
}
