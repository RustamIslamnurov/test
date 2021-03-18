package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarService carService;


    @GetMapping("/rest")
    public List<Car> rest() {
        RestTemplate restTemplate = new RestTemplate();
        List<Car> result = restTemplate.getForObject("http://localhost:8088/car", List.class);
        return result;
    }

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
    public String finbByName(){ return carService.findByName(); }

    @GetMapping
    public ResponseEntity<Object> allUsers(@RequestParam(name = "id", required = false) Long id) {
        return ResponseEntity.ok(carService.getCars(id));
    }

}
