package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "contact")

public class ContactCity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String firstName;

    private String lastName;

    private Date birthDate;


}
