package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="a_user")
@ApiModel(value = "Юзер")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @ApiModelProperty(value = "АЙДИ")
    private Long id;

    @Column(name="first_name")
    @ApiModelProperty(value = "Имя")
    private String first_name;

    @Column(name="last_name")
    @ApiModelProperty(value = "Фамилия")
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
