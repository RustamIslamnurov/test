package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;

@ExtendWith(MockitoExtension.class)
class CarControllerTest {

    @InjectMocks
    CarController carController;

    @Mock
    CarService carService;

    @Test
    void saveCar() {
        Mockito.when(carService.getCars(eq(3L))).thenReturn(new Car());
        ResponseEntity result = carController.allUsers(3L);
        assertEquals(ResponseEntity.ok(new Car()), result);
    }
}