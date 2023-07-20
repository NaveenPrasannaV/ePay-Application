package com.cg.epay.dao;

import com.cg.epay.entity.Customer;

public interface CustomerDao {

	String saveCustomer(Customer customer);

	boolean isExistsByCustomerEmail(String customerEmail);

	boolean isExistsByCustomerMobileNumber(String customerMobileNumber);

	boolean isExistsByCustomerKYCNumber(String customerKYCNumber);
}
