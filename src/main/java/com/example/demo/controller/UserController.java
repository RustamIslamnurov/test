package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "user", description = "CRUD operations", tags = "User API")
public class UserController {

    @Autowired
    UserService userService;



    @GetMapping("/users")
    @ApiOperation(value = "Вывести всех юзеров")
    public List<User> findUsers() {return userService.findAll();}

    @PostMapping("/adduser")
    @ApiOperation(value = "Сохранить юзера")
    public void save(@RequestBody User user){userService.saveUser(user);}

    @DeleteMapping("/deluser/{id}")
    @ApiOperation(value = "Удалить юзера по ID")
    public void delById(@PathVariable Long id){userService.delById(id);}

    @GetMapping("/users/{id}")
    @ApiOperation(value = "Найти юзера по id")
    public User findOne(@PathVariable Long id) {return userService.one(id);}
}