package com.example.demo.service;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;

	@Transactional
	public void saveCar(@Valid Car car) {
		// TODO Auto-generated method stub
		carRepository.save(car);
	}
}
