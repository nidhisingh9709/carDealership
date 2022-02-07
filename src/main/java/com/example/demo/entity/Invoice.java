package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Invoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int invoiceId;
	
	private String carName;
	
	private double price;
	
	private double taxRate;
	
	private double totalCost;
	
	@OneToOne(mappedBy="salesman")
	private Salesman salesman;

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}


	public void setTotalCost(double price, double taxRate) {
		double total= price+(price*(100+taxRate)/100);
		this.totalCost=total;
		
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}
	
	

}
