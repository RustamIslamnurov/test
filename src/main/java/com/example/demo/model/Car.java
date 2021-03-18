package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "a_car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marka")
    private String marka;

    @Column(name = "nomer")
    private Integer nomer;


//    @JsonIgnore
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="user_id", nullable=false)
//    private User user;

    @JsonBackReference
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "cars")					//cars ссылка на модель User в лист.
    private List<User> users = new ArrayList<>();
}
