package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Salesman {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int salesmanId;

	@NotBlank
	@Pattern(regexp = "^[A-Z a-z]*$")
	private String name;

	@Column(name = "commission_rate")
	private double commissionRate;

	private int totalSales;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "invoice_id", referencedColumnName = "InvoiceId")
	private Invoice invoice;

	// Salesman can sell multiple cars
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "salesman")
	private List<Car> car = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "salesman")
	private List<Customer> customer = new ArrayList<>();

	public Salesman() {

	}

	public Salesman(int salesmanId, @NotBlank @Pattern(regexp = "^[A-Z a-z]*$") String name, double commissionRate,
			int totalSales, List<Car> car) {
		super();
		this.salesmanId = salesmanId;
		this.name = name;
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
		this.car = car;
	}

	public int getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

}
