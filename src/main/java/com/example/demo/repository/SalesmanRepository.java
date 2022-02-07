package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Salesman;

@Repository
public interface SalesmanRepository extends CrudRepository<Salesman,Integer>{

	Iterable<Salesman> findAll();

}
