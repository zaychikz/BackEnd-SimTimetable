package com.example.store.service;

import java.util.List;

import com.example.store.model.Timetable;

public interface TimetableService {
    List<Timetable> findAll();
    Timetable create(Timetable timetable); // Updated return type to Timetable
    void delete(int id); // Changed the parameter type to int
    Timetable update(int id, Timetable timetable); // Updated parameter and return type to Timetable
}
