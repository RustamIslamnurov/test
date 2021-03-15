package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name="c_cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="population")
    private int population;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_contact", referencedColumnName = "id")
//    private ContactCity contactCity;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "city") //user берется из модели Car
    private List<ContactCity> contactCityList = new ArrayList<>();



}