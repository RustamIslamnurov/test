package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/car")
    public List<Car> findCar(){
        return carService.findAll();
    }

    @PostMapping("/addcar")
    public void saveCar(@RequestBody Car car){
        carService.addCar(car);
    }

    @DeleteMapping("/delcar/{id}")
    public void delCar(@PathVariable Long id){
        carService.delById(id);
    }

    @GetMapping("/carname")
    public List<String> finbByName(){
        return carService.findByName();

    }

}
