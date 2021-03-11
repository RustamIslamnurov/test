package com.example.demo.service;

import com.example.demo.model.ContactCity;

import java.util.Date;
import java.util.List;

public interface ContactService {

    ContactCity postContact(ContactCity contactCity);

    ContactCity editContact(ContactCity contactCity);

    void deleteById(Long ID);

    List<String> sortByLastName();

    List<Date> sortByDate();

    List<String> sortByLetter();

    List<String> sortByLetter1();

    List<String> sortByLetter2();






}
