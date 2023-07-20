package com.cg.epay.Utils;

import java.util.regex.Pattern;

import com.cg.epay.entity.Customer;
import com.cg.epay.factory.ObjectFactory;
import com.cg.epay.model.CustomerDTO;

public class CustomerUtil {

	public static boolean isValidCustomerName(String name) {
		// Regex pattern to allow only alphabets and space (no numbers or special
		// characters)
		return Pattern.matches("^[a-zA-Z\\s]+$", name);
	}

	public static boolean isValidMobileNumber(String mobileNumber) {
		// Regex pattern to allow only 10-digit numbers
		return Pattern.matches("^\\d{10}$", mobileNumber);
	}

	public static boolean isValidKYCNumber(String kycNumber) {
		// Regex pattern to allow only 12-digit numbers
		return Pattern.matches("^\\d{12}$", kycNumber);
	}

	public static boolean isValidPassword(String password) {
		// Regex pattern to require at least one alphabet, one digit, one special
		// character,
		// and a length between 8 and 20 characters.
		return Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$", password);
	}

	public static boolean isValidEmail(String email) {
		// Regex pattern to check if the email has '@' in the middle and ends with
		// '.com'
		return Pattern.matches("^[^@]+@[^@.]+\\.com$", email);
	}

	/*
	 * Convert Customer DTO to Customer Entity
	 */
	public static Customer convertCustomerDTOToCustomerEntity(CustomerDTO customerDTO) {
		Customer customer = ObjectFactory.createObject(Customer::new);
		customer.setCustomerName(customerDTO.getCustomerName());
		customer.setCustomerMobileNumber(customerDTO.getCustomerMobileNumber());
		customer.setCustomerKYCNumber(customerDTO.getCustomerKYCNumber());
		customer.setPassword(customerDTO.getPassword());
		customer.setCustomerEmail(customerDTO.getCustomerEmail());
		return customer;
	}

}
