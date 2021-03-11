package com.example.demo.controller;

import com.example.demo.model.ContactCity;
import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;


    @PostMapping("/addcont")
    public void save(@RequestBody ContactCity contactCity){
        contactService.postContact(contactCity);
    }

    @GetMapping("/lol")
    public List<String> last(){
        return contactService.sortByLastName();
    }

    @GetMapping("/date")
    public List<Date> date(){
        return contactService.sortByDate();
    }

    @GetMapping("/letter")
    public List<String> letter(){
        return contactService.sortByLetter();
    }

    @GetMapping("/letter1")
    public List<String> letter1(){
        return contactService.sortByLetter1();
    }

    @GetMapping("/letter2")
    public List<String> letter2(){
        return contactService.sortByLetter2();
    }
}
