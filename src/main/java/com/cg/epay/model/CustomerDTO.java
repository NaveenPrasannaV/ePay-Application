package com.cg.epay.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CustomerDTO {
	private String customerName;
	private String customerMobileNumber;
	private String customerKYCNumber;
	private String customerId;
	private String password;
	private String customerEmail;
}
