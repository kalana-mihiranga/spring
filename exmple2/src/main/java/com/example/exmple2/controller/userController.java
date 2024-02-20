package com.example.exmple2.controller;


import com.example.exmple2.entity.User;
import com.example.exmple2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class userController {

    private UserService userService ;

@Autowired
    public userController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllusers(){
    return  userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserbyId(@PathVariable Long id){
    return  userService.getUserbyId(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
    return userService.saveUser(user);
    }
}
