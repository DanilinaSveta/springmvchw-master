package ru.nnov.nntu.vst.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nnov.nntu.vst.demo.models.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserRestController {



    @GetMapping("/user")
    public User getUser() {
        User user = new User("Админ", "admin@nntu.ru");
        return user;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Админ", "admin@nntu.ru"));
        users.add(new User("Админ2", "admin2@nntu.ru"));

        return users;
    }
}