package com.cts.spring.jpa.mvc.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "test_Transaction" )
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long txnId;
	
	private String description;
	
	private Double amount;
	
	private LocalDate txnDate;
	
	@Enumerated(EnumType.STRING)
	private TransactionType type;	
	
	
	public Transaction() {
		super();
	}

	public Transaction(Long txnId, String description, Double amount, LocalDate txnDate, TransactionType type) {
		super();
		this.txnId = txnId;
		this.description = description;
		this.amount = amount;
		this.txnDate = txnDate;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transaction [txnId=" + txnId + ", description=" + description + ", amount=" + amount + ", txnDate="
				+ txnDate + ", type=" + type + "]";
	}

	public Long getTxnId() {
		return txnId;
	}

	public void setTxnId(Long txnId) {
		this.txnId = txnId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

}
