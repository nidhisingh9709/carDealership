package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Invoice;
import com.example.demo.repository.InvoiceRepository;

@Service
public class InvoiceService {
	
	@Autowired
	InvoiceRepository invoiceRepository;

	public Iterable<Invoice> getInvoices() {
		// TODO Auto-generated method stub
		return invoiceRepository.findAll();
	}

	public Optional<Invoice> getInvoice(Integer id) {
		// TODO Auto-generated method stub
		return invoiceRepository.findById(id);
	}

	public void saveInvoice(@Valid Invoice invoice) {
		// TODO Auto-generated method stub
		invoiceRepository.save(invoice);
	}

	public void deleteInvoice(Integer id) {
		// TODO Auto-generated method stub
		invoiceRepository.deleteById(id);
	}
	

}
