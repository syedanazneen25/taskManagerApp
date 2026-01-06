package com.nazneen.taskmanagerapp.controller;

import com.nazneen.taskmanagerapp.entity.User;
import com.nazneen.taskmanagerapp.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // POST /api/users  Body: {"name":"Nazneen","email":"nazneen@test.com"}
    @PostMapping
    public User create(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        String email = body.get("email");

        if (name == null || name.isBlank() || email == null || email.isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "name and email are required");
        }

        return userService.createUser(name, email);
    }

    // GET /api/users
    @GetMapping
    public List<User> getAll() {
        return userService.getAllUsers();
    }
}
