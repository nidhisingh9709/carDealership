package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	@NotBlank
	@Pattern(regexp = "^[A-Za-z ]*$")
	private String name;

	@NotBlank
	@Pattern(regexp = "^[0-9]{10}$")
	private String contactNumber;

	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9 -&]*")
	private String address;


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "salesman_id", referencedColumnName = "salesmanId")
	private Salesman salesman;

	public Customer() {

	}

	public Customer(int customerId, @NotBlank @Pattern(regexp = "^[A-Za-z ]*$") String name,
			@NotBlank @Pattern(regexp = "^[0-9]{10}$") String contactNumber,
			@NotBlank @Pattern(regexp = "^[a-zA-Z0-9 -&]*") String address, Salesman salesman) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
		this.salesman = salesman;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

}
