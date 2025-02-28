package com.example.app;

class User {
    private String name, email, password;

    User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    String getName() { return name; }
    String getEmail() { return email; }
    String getPassword() { return password; }
}
