package com.example.demo.repository;

import com.example.demo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query("select name from cities")
    List primer();

    @Query ("select population from cities order by population")
    List <Integer> many();

    @Query("select name from cities where population = 464000 ")
    String her();


}
