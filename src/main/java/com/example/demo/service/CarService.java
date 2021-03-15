package com.example.demo.service;

import com.example.demo.model.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    void addCar(Car car);

    void delById(Long id);
}
