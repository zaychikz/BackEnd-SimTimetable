package com.example.store.service;

import java.util.List;

import com.example.store.model.Subject;

public interface SubjectService {
    List<Subject> findAll();
    Subject create(Subject subject); // Updated return type to Subject
    void delete(int id); // Changed the parameter type to int
    Subject update(int id, Subject subject); // Updated parameter and return type to Subject
}
