package com.example.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.store.model.User;
import com.example.store.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService; // แก้ชื่อตัวแปรเป็น userService

    @GetMapping(value = "/user/get/all") // แก้ endpoint URL เป็น /user/get/all
    public ResponseEntity<List<User>> findAll() {
        List<User> list = userService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/user/save") // แก้ endpoint URL เป็น /user/save
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping("/user/update/{id}") // แก้ endpoint URL เป็น /user/update/{id}
    public User update(@PathVariable("id") int id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/user/{id}") // แก้ endpoint URL เป็น /user/{id}
    public void delete(@PathVariable("id") int id) {
        userService.delete(id);
    }
}

