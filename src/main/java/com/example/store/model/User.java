package com.example.store.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id") // Change the column name to "user_id"
    private int userId;

    @Column(unique = true, name = "username") // Set the column name to "username" and make it unique
    private String username;

    @Column(name = "name") // Change the column name to "name"
    private String name;

    private String password;

    // Constructors, getters, setters, and other methods can remain the same.
}
