package com.example.app;

class UserService {
    private UserRepository repository;

    UserService(UserRepository repository) {
        this.repository = repository;
    }

    // Create a User
    void createUser(String name, String email, String password) {
        repository.save(new User(name, email, password));
    }

    // Login Functionality
    boolean loginUser(String email, String password) {
        User user = repository.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }

    User getUserByEmail(String email) {
        return repository.findByEmail(email);
    }
}
