package com.cts.spring.jpa.mvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.spring.jpa.mvc.entity.Transaction;
import com.cts.spring.jpa.mvc.entity.TransactionType;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {
	
	//List<Transaction> findAllByType(TransactionType txnType);

}
