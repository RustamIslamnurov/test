package com.example.demo.repository;

import com.example.demo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query("select city.name from City city ")
    List<String> primer();

    @Query ("select city.population from City city order by city.population")
    List <Integer> many();

    @Query("select city.name from City city where city.population = 464000 ")
    String her();




}
