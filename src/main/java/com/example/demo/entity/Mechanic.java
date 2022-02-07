package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Mechanic {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mechanicId;
	
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "car_serialNo." ,referencedColumnName="serialNumber" )
    private Car car;

	public Integer getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(Integer mechanicId) {
		this.mechanicId = mechanicId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
