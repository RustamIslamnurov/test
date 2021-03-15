package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void saveUser(User user);

    void delById(Long id);

    User one(Long id);

}
