package com.example.exmple2.service;

import com.example.exmple2.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserbyId(Long id);
    User saveUser(User user);
    User updateUser(Long id,User user);
    void deleteUser(Long id);


}
