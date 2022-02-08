package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
@Autowired
CustomerRepository customerRepository;

public Iterable<Customer> getCustomers() {
	// TODO Auto-generated method stub
	return customerRepository.findAll();
}

public Optional<Customer> getCustomer(Integer id) {
	// TODO Auto-generated method stub
	return customerRepository.findById(id);
}

public void saveCustomer(@Valid Customer customer) {
	// TODO Auto-generated method stub
	customerRepository.save(customer);
}

public void deleteCustomer(Integer id) {
	// TODO Auto-generated method stub
	customerRepository.deleteById(id);
}





}
