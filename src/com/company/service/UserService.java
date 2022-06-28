package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User findUserById(int id);
    void removeUserById(int id);
    List<User> getAllUsers();
}
