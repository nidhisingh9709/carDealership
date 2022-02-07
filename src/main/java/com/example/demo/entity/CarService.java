package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarService {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer serviceId;


}
