package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Car;
import com.example.demo.service.CarService;

@RestController
public class CarController {
@Autowired
CarService carService;

@PostMapping("/addCar")
public void saveCar(@RequestBody @Valid Car car) {
	carService.saveCar(car);
}
}
