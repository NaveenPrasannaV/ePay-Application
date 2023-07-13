package com.cg.epay.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AccountDTO {
	
	private String accountNumber;
	private String ifscCode;
	private double accountBalance;
	private Date accountOpenDate;
	
}
