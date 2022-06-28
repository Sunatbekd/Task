package com.company;

import com.company.Sex.Gender;
import com.company.model.User;
import com.company.service.UserService;
import com.company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.addUser(new User(1, "2q134", 18, Gender.MALE));
        userService.addUser(new User(2, "asdf", 19, Gender.FEMALE));
        userService.addUser(new User(3, "qewrtt", 28, Gender.MALE));

        userService.getAllUsers().forEach(System.out::println);
        System.out.println("---------------------------------------------------");
        userService.removeUserById(2);
        System.out.println("---------------------------------------------------");
        userService.getAllUsers().forEach(System.out::println);
        System.out.println("---------------------------------------------------");
        System.out.println(userService.findUserById(3));
    }
}
