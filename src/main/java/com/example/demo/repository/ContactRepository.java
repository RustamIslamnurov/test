package com.example.demo.repository;

import com.example.demo.model.ContactCity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ContactRepository extends JpaRepository <ContactCity, Long> {

    @Query("select con.lastName from ContactCity con order by con.lastName")
    List<String> sortByLastName();

    @Query("select con.birthDate from ContactCity con order by con.birthDate desc ")
    List<Date> sortByDate();

    @Query("select con.lastName from ContactCity con where con.lastName like '%v'")
    List<String> sortByLetter();

    @Query("select con.lastName from ContactCity con where con.lastName like 'a_'")
    List<String> sortByLetter1();

    @Query("select con.lastName from ContactCity con where con.lastName like '%fs%'")
    List<String> sortByLetter2();

}
