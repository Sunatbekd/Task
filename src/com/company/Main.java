package com.company;
import com.company.Sex.Gender;
import com.company.impl.UserServiceImpl;
import com.company.model.User;
import com.company.service.UserService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Asan",25,Gender.MALE));
        users.add(new User(2,"Ainura",26,Gender.FEMALE));
        users.add(new User(3,"Dastan",27,Gender.MALE));

        UserService userService = new UserServiceImpl();
        while (true){
            System.out.println("====================================");
            System.out.println("Введите слово 'add' чтобы добавить пользователя");
            System.out.println("Введите слово 'find' для поиска по id");
            System.out.println("Введите слово 'remove' для удаление по id");
            System.out.println("Введите слово 'all' для получения всех пользователей");
            System.out.println("====================================");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            switch (word){
                case "add":
                    try {
                        userService.addUser(users);
                    } catch (MyExeption e) {
                        System.out.println(e.getMessage());
                    }catch (InputMismatchException i){
                        System.out.println("tamga jazba!");
                    }
                    break;
                case "find":
                    try {
                        userService.findUserById(users);
                    }catch (MyExeption e){
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("tamga jazba!");
                    }
                    break;
                case "remove":
                    try {
                        userService.removeUserById(users);
                    }catch (MyExeption exeption){
                        System.out.println(exeption.getMessage());
                    }catch (InputMismatchException i) {
                        System.out.println("tamga jazba!");
                    }
                    break;
                case "all":
                    userService.getAllUsers(users);
                    break;
                default:
                    System.out.println("Менюдагы англисче жазылган создорду туура жаз!!!");
            }
        }
    }
}
