package com.example.demo.repository;

import com.example.demo.model.ContactCity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ContactRepository extends JpaRepository <ContactCity, Long> {

    @Query("select lastName from contact order by lastName")
    List<String> sortByLastName();

    @Query("select birthDate from contact order by birthDate desc ")
    List<Date> sortByDate();

    @Query("select lastName from contact where lastName like '%v'")
    List<String> sortByLetter();

    @Query("select lastName from contact where lastName like 'a_'")
    List<String> sortByLetter1();

    @Query("select lastName from contact where lastName like '%fs%'")
    List<String> sortByLetter2();

}
