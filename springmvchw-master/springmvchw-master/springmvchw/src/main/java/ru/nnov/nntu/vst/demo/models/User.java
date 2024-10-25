package ru.nnov.nntu.vst.demo.models;

public class User {
    private String name; // Имя пользователя
    private String email; // Email пользователя

    // Конструктор, принимающий значения переменных
    public User(String username, String email) {
        this.name = username;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
