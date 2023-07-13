package com.cg.epay.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Account {

	private String accountNumber;
	private String ifscCode;
	private double accountBalance;
	private Date accountOpenDate;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Customer customer;

	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private DebitCard debitCard;
}
