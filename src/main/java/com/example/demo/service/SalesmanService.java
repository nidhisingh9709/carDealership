package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Salesman;
import com.example.demo.repository.SalesmanRepository;

@Service
public class SalesmanService {

	@Autowired
	SalesmanRepository salesmanRepository;

	public Iterable<Salesman> getSalesman() {
		// TODO Auto-generated method stub
		return salesmanRepository.findAll();
	}

	public Optional<Salesman> getSalesmans(Integer salesmanId) {
		// TODO Auto-generated method stub
		return salesmanRepository.findById(salesmanId);
	}

	@Transactional
	public void saveSalesman(@Valid Salesman salesman) {
		// TODO Auto-generated method stub
		salesmanRepository.save(salesman);
	}

	@Transactional
	public void deleteSalesman(Integer salesmanId) {
		// TODO Auto-generated method stub
		salesmanRepository.deleteById(salesmanId);
	}

}
