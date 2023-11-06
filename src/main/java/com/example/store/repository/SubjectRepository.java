package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> { // Change the type to Integer
}
