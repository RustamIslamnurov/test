package com.example.demo.service.impl;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;
    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<City> findByName() {
        return cityRepository.primer();
    }

    @Override
    public City help() {
        return cityRepository.findById(5L).get();
    }

    @Override
    public List<Integer> many() {
        return cityRepository.many();
    }

    @Override
    public String her() {
        return cityRepository.her();
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public void saveCity(City city) {
        cityRepository.save(city);
    }

    @Override
    public void delByName(String name) {
        cityRepository.delByName(name);
    }


}
