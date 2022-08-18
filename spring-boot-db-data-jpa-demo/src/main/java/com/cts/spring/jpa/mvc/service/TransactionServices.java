package com.cts.spring.jpa.mvc.service;

import java.util.List;

import com.cts.spring.jpa.mvc.entity.Transaction;

public interface TransactionServices {
	
	List<Transaction> getAll();
	
	Transaction getById(Long id);
	
	Transaction add(Transaction txn);
	
	void remove(Long txnId);
	

}