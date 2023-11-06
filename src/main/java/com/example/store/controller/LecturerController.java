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

import com.example.store.model.Lecturer;
import com.example.store.service.LecturerService;

@RestController
@RequestMapping("/api")
public class LecturerController {

    @Autowired
    private LecturerService lecturerService; // แก้ชื่อตัวแปรเป็น lecturerService

    @GetMapping(value = "/lecturer/get/all") // แก้ endpoint URL เป็น /lecturer/get/all
    public ResponseEntity<List<Lecturer>> findAll() {
        List<Lecturer> list = lecturerService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/lecturer/save") // แก้ endpoint URL เป็น /lecturer/save
    public Lecturer create(@RequestBody Lecturer lecturer) {
        return lecturerService.create(lecturer);
    }

    @PutMapping("/lecturer/update/{id}") // แก้ endpoint URL เป็น /lecturer/update/{id}
    public Lecturer update(@PathVariable("id") int id, @RequestBody Lecturer lecturer) {
        return lecturerService.update(id, lecturer);
    }

    @DeleteMapping("/lecturer/{id}") // แก้ endpoint URL เป็น /lecturer/{id}
    public void delete(@PathVariable("id") int id) {
        lecturerService.delete(id);
    }
}

