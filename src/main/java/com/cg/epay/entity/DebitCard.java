package com.cg.epay.entity;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class DebitCard {

	private String cardNumber;
	private Date cardExpiryDate;
	private int CVV;
	private String cardIssuer;

}
