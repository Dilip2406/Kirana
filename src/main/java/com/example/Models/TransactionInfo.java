package com.example.Models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TransactionInfo {
	@Id
	int transactionId;
	double transactionAmount;
	String transactionType;
	String Currency;
	Date transactionDate;
	
	
}
