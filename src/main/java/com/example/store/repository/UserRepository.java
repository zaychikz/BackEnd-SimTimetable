package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.model.User;

public interface UserRepository extends JpaRepository<User, Integer> { // Change the type to Integer
}
