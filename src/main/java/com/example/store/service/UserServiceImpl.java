package com.example.store.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.model.User;
import com.example.store.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(int id, User user) {
        Optional<User> existingUserOptional = userRepository.findById(id);

        if (existingUserOptional.isPresent()) {
            User existingUser = existingUserOptional.get();
            existingUser.setUsername(user.getUsername());
            existingUser.setName(user.getName());
            existingUser.setPassword(user.getPassword());
            // Update other fields as needed

            return userRepository.save(existingUser);
        } else {
            // Handle the case where the user with the given ID is not found.
            // You can return null, throw an exception, or handle it in your own way.
            // For this example, we'll return null.
            return null;
        }
    }
}
