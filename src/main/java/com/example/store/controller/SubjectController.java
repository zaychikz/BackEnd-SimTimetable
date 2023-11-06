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

import com.example.store.model.Subject;
import com.example.store.service.SubjectService;

@RestController
@RequestMapping("/api")
public class SubjectController {

    @Autowired
    private SubjectService subjectService; // แก้ชื่อตัวแปรเป็น subjectService

    @GetMapping(value = "/subject/get/all") // แก้ endpoint URL เป็น /subject/get/all
    public ResponseEntity<List<Subject>> findAll() {
        List<Subject> list = subjectService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/subject/save") // แก้ endpoint URL เป็น /subject/save
    public Subject create(@RequestBody Subject subject) {
        return subjectService.create(subject);
    }

    @PutMapping("/subject/update/{id}") // แก้ endpoint URL เป็น /subject/update/{id}
    public Subject update(@PathVariable("id") int id, @RequestBody Subject subject) {
        return subjectService.update(id, subject);
    }

    @DeleteMapping("/subject/{id}") // แก้ endpoint URL เป็น /subject/{id}
    public void delete(@PathVariable("id") int id) {
        subjectService.delete(id);
    }
}
