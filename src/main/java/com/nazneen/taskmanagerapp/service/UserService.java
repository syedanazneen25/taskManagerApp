package com.nazneen.taskmanagerapp.service;

import com.nazneen.taskmanagerapp.entity.User;
import com.nazneen.taskmanagerapp.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name, String email) {
        return userRepository.save(new User(name, email));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
