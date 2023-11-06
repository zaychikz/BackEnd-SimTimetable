package com.example.store.service;

import java.util.List;

import com.example.store.model.User;

public interface UserService {
    List<User> findAll();
    User create(User user); // Updated return type to User
    void delete(int id); // Changed the parameter type to int
    User update(int id, User user); // Updated parameter and return type to User
}
