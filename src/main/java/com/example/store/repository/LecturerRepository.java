package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> { // Change the type to Integer
}
