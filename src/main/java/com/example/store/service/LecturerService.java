package com.example.store.service;

import java.util.List;

import com.example.store.model.Lecturer;

public interface LecturerService {
    List<Lecturer> findAll();
    Lecturer create(Lecturer lecturer); // Updated return type to Lecturer
    void delete(int id); // Changed the parameter type to int
    Lecturer update(int id, Lecturer lecturer); // Updated parameter and return type to Lecturer
}

