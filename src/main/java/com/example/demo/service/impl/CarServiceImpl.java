package com.example.demo.service.impl;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo carRepo;

    @Override
    public List<Car> findAll() {
        return carRepo.findAll();
    }

    @Override
    public void addCar(Car car) {
        carRepo.save(car);
    }

    @Override
    public void delById(Long id) {
        carRepo.deleteById(id);
    }

    @Override
    public List<String> findByName() {
        return carRepo.primer()
                .stream()
                .sorted((o1,o2)-> o1.compareTo(o2))
                .collect(Collectors.toList());
    }
}
