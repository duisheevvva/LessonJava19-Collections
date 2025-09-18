package generic;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements GeneralService<User> {

    ArrayList<User> database = new ArrayList<>();
    @Override
    public void save(User user) {
        database.add(user);
    }

    @Override
    public List<User> getAll() {
        return database;
    }

    @Override
    public <E> User getByValue(E value) {
        for (User user: database) {
            if (user.getUsername().equals(value)){
                return user;
            }
        }
        return null;
    }


    @Override
    public <E> void update(E value, User user) {
        User oldUser = getByValue(value);
        oldUser.setUsername(user.getUsername());
        oldUser.setEmail(user.getEmail());
    }

    @Override
    public <E> void delete(E value) {
        User deleteUser = getByValue(value);
        database.remove(deleteUser);
    }
}
