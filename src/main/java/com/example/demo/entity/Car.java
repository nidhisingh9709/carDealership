package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carId;

	@NotBlank 
	private long serialNumber;
	
	@NotBlank
	private String model;

	@NotBlank
	private String color;
	
	@OneToOne(mappedBy="car")
	private Mechanic mechanic;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "salesman_id", referencedColumnName = "salesmanId")
	private Salesman salesman;

	public Car() {

	}

	public Car(int carId, @NotBlank String model, @NotBlank String color) {
		super();
		this.carId = carId;
		this.model = model;
		this.color = color;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}
	
	

}
