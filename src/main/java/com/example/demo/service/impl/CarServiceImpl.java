package com.example.demo.service.impl;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public String findByName() {
        return carRepo.primer()
                .stream()
                .findFirst()
                .orElse("0");

                // нужен long
//                .stream()
//                .filter("BMW"::equals)
//                .count();

//                .stream()
//                .sorted((o1,o2)-> o1.compareTo(o2))
//                .collect(Collectors.toList());

    }

    @Override
    public Object getCars(Long id) {

        if (id == null) {
            return carRepo.findAll();
        } else {
            return carRepo.findById(id).get();

        }
    }
}
