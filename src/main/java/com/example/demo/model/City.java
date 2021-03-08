package com.example.demo.model;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Data
@Entity(name="cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int population;


}