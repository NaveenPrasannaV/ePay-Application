package com.cg.epay.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CustomerDTO {

	private String customerId;
	private String customerName;
	private String customerMobileNumber;
	private String customerKYCNumber;
	private String password;
	private String customerEmail;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCustomerKYCNumber() {
		return customerKYCNumber;
	}

	public void setCustomerKYCNumber(String customerKYCNumber) {
		this.customerKYCNumber = customerKYCNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

}
