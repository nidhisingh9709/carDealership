package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Invoice;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice,Integer> {

}
