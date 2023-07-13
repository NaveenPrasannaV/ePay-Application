package com.cg.epay.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class DebitCardDTO {
	
	private String cardNumber;
	private Date cardExpiryDate;
	private int CVV;
	private String cardIssuer;
	
}
