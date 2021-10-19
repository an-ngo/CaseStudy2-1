package controller.userManager;

import model.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements IUserManager{
    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
