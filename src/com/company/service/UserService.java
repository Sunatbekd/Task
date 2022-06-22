package com.company.service;

import com.company.MyExeption;
import com.company.model.User;

import java.util.List;

public interface UserService {
    void addUser(List<User> userList) throws MyExeption;
    void findUserById(List<User> userList) throws MyExeption;
    void removeUserById(List<User> userList) throws MyExeption;
    void getAllUsers(List<User> userList);


}
