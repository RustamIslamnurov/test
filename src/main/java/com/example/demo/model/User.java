package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="a_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id", referencedColumnName = "id")
//    private Car car;

//    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy="user") //user берется из модели Car
//    private Set<Car> car;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_car",								//Подключаем табличку user_car(несущность).Она является посредником между таблицой a_user и a_car
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),		//user_id имеет foreng_key, ссылается на таблицу a_user в колонку id
            inverseJoinColumns = @JoinColumn(name = "car_id", referencedColumnName = "id")	//car_id имеет foreng_key, ссылается на таблицу a_car в колонку id
    )
    private List<Car> cars = new ArrayList<>();
}
