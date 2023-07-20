package com.cg.epay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.epay.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	boolean existsByCustomerEmail(String customerEmail);
	boolean existsByCustomerMobileNumber(String customerMobileNumber);
	boolean existsByCustomerKYCNumber(String customerKYCNumber);
}
