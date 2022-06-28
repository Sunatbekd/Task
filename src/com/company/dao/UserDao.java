package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private List<User> user = new ArrayList<>();

    public List<User> getUser() {
        return user;
    }
}
