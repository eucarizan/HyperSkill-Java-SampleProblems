import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private final List<User> users;

    public UserDaoImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public User get(int id) {
        User found = findById(id);
        if (found == null) {
            return null;
        }
        return new User(found.getId(), found.getName());
    }

    @Override
    public void update(User user) {
        User found = findById(user.getId());
        if (found != null) {
            found.setName(user.getName());
        }
    }

    @Override
    public void delete(int id) {
        User found = findById(id);
        if (found != null) {
            users.remove(found);
        }
    }

    private User findById(int id) {
        for (User user : users) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }
}
