package com.company.service.impl;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUser().add(user);
    }

    @Override
    public User findUserById(int id) {
        for (User user : userDao.getUser()) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void removeUserById(int id) {
        userDao.getUser().removeIf(user -> id == user.getId());
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getUser();
    }
}
