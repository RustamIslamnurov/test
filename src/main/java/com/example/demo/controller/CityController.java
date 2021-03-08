package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> findCities() {

        return cityService.findAll();
    }

    @GetMapping("/name")
    public List findByName() {

        return cityService.findByName();
    }

    @GetMapping("/id")
    public City help() {

        return cityService.help();
    }

    @GetMapping("/many")
    public List<Integer> many() {

        return cityService.many();
    }

    @GetMapping("/pop")
    public String her() {

        return cityService.her();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody City city){

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(){

    }
}