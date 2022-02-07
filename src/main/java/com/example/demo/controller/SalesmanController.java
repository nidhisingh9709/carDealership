package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Salesman;
import com.example.demo.service.SalesmanService;

@RestController
public class SalesmanController {

	@Autowired
    SalesmanService salesmanService;
	
	@GetMapping("/salesman")
	public Iterable<Salesman> getSalesman(){
		return salesmanService.getSalesman();
	}
	
	@GetMapping("/salesman/{salesmanId}")
	public Optional<Salesman> getSalesman(@PathVariable("salesmanId") Integer salesmanId){
		return salesmanService.getSalesmans(salesmanId);
	}
	
	@PostMapping("/salesman")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void saveSalesman(@RequestBody @Valid Salesman salesman) {
		salesmanService.saveSalesman(salesman);
	}
	
	@DeleteMapping("/salesman/{id}")
	public void deleteSalesman(@PathVariable("salesmanId") Integer salesmanId) {
		salesmanService.deleteSalesman(salesmanId);
	}
	
}
