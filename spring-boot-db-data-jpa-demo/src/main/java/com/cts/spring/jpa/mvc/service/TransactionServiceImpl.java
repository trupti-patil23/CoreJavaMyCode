package com.cts.spring.jpa.mvc.service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.cts.spring.jpa.mvc.entity.Transaction;
import com.cts.spring.jpa.mvc.repo.TransactionRepo;

@Service
public class TransactionServiceImpl implements TransactionServices {	
	
	@Autowired
	private TransactionRepo txnRepo;
	
	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}
	
	@Bean
	public DateTimeFormatter dtFormat() {
		return DateTimeFormatter.ofPattern("dd-MM-yy");
	}

	@Override
	public List<Transaction> getAll() {
		return txnRepo.findAll();
	}

	@Override
	public Transaction getById(Long id) {
		return txnRepo.findById(id).orElse(null);
	}

	@Override
	public Transaction add(Transaction txn) {
		return txnRepo.save(txn);
	}

	@Override
	public void remove(Long txnId) {
		txnRepo.deleteById(txnId);
	}

}
