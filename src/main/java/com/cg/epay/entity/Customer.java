package com.cg.epay.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	private String customerName;
	private String customerMobileNumber;
	private String customerKYCNumber;
	private String customerId;
	private String password;
	private String customerEmail;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Account account;
}
