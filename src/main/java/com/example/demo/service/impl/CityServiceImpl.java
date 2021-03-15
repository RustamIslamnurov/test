package com.example.demo.service.impl;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;


    @Override
    public List<City> findAll() {
        List<String> city=new ArrayList<>();
        List<City> list= cityRepository.findAll();
        for (int i = 0; i < list.size(); i++) {
            city.add(list.get(i) + " util");
            System.out.println("XUI");
        }
        return list;
    }

    @Override
    public List<String> findByName() {

        return null;
    }

    @Override
    public City help() {
        return cityRepository.findById(2L).get();
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
    }


}
