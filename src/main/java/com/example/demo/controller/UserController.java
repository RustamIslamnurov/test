package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> findUsers() {return userService.findAll();}

    @PostMapping("/adduser")
    public void save(@RequestBody User user){userService.saveUser(user);}

    @DeleteMapping("/deluser/{id}")
    public void delById(@PathVariable Long id){userService.delById(id);}

    @GetMapping("/users/{id}")
    public User findOne(@PathVariable Long id) {return userService.one(id);}
}