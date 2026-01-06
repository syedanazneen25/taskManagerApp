package com.nazneen.taskmanagerapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // "user" is a reserved word in some DBs, so we use "users"
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // we keep it simple for now
    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    // JPA requires no-arg constructor
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getters/setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
