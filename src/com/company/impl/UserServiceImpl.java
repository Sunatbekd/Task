package com.company.impl;

import com.company.Sex.Gender;
import com.company.MyExeption;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    @Override
    public void addUser(List<User> userList) throws MyExeption{

            System.out.println("Введите id пользователя: ");
            int id = scanner.nextInt();
            if (id<0){
                throw new MyExeption("Ters san jazba!");
            }

            System.out.println("Введите имя пользователя: ");
            String name = scanner2.nextLine();
            if (name.matches("^[a-zA-Z]*^$")){
                throw new MyExeption("San jazba!");
            }

            System.out.println("Введите возраст пользователя: ");
            int age = scanner.nextInt();
            if (age>130){
                throw new MyExeption("Jashy 130 dan az boluu kerek!");
            }

            System.out.println("Введите пол пользователя");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            Gender gender = Gender.getGenderByValue(userInput);

            User user = new User(id, name, age, gender);
            userList.add(user);

            System.out.println("Все пользователи: ");
            userList.forEach(System.out::println);
    }

    @Override
    public void findUserById(List<User> userList) throws MyExeption{
        System.out.println("Поиск пользователя по id: ");
        int id = scanner.nextInt();
        int count = 0;
        for (User user : userList) {

            if (user.getId() == id) {
                count++;
                System.out.println("id = " + user.getId());
                System.out.println("Name = " + user.getName());
                System.out.println("Age = " + user.getAge());
                System.out.println("Gender = " + user.getGender());
            }
        }
            if(count == 0) {
                throw new MyExeption("По токой ID пользователя не существует ");

        }
    }

    @Override
    public void removeUserById(List<User> userList) throws MyExeption{
        System.out.println("Все пользователи: ");
        userList.forEach(System.out::println);
        System.out.println("Удаление пользователя по id: ");
        int removeId = scanner.nextInt();
        int count = 0;
        for (User user : userList) {
            if (removeId==user.getId()){
                count++;
                userList.remove(user);
            }
        }
        if (count==0){
            throw new MyExeption("По токой ID не существует пользователя для удаления");
        }
        System.out.println("Все пользователи: ");
        userList.forEach(System.out::println);
    }

    @Override
    public void getAllUsers(List<User> userList) {
        System.out.println("Все пользователи: ");
        userList.forEach(System.out::println);

    }
}
