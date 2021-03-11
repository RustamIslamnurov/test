package com.example.demo.service.impl;

import com.example.demo.model.ContactCity;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepository contactRepository;


    @Override
    public ContactCity postContact(ContactCity contactCity) {
        return contactRepository.save(contactCity);
    }

    @Override
    public ContactCity editContact(ContactCity contactCity) {
        return null;
    }

    @Override
    public void deleteById(Long ID) {
    }

    @Override
    public List<String> sortByLastName() {
        return contactRepository.sortByLastName();
    }

    @Override
    public List<Date> sortByDate() {
        return contactRepository.sortByDate();
    }

    @Override
    public List<String> sortByLetter() {
        return contactRepository.sortByLetter();
    }

    @Override
    public List<String> sortByLetter1() {
        return contactRepository.sortByLetter1();
    }

    @Override
    public List<String> sortByLetter2() {
        return contactRepository.sortByLetter2();
    }


}
