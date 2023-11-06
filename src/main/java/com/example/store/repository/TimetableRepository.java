package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.model.Timetable;

public interface TimetableRepository extends JpaRepository<Timetable, Integer> { // Change the type to Integer
}
