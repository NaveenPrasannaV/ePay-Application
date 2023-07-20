package com.cg.epay.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.epay.dao.CustomerDao;
import com.cg.epay.entity.Customer;
import com.cg.epay.repository.CustomerRepository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public String saveCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Signed up successfully!";
	}

	@Override
	public boolean isExistsByCustomerEmail(String customerEmail) {
		return customerRepository.existsByCustomerEmail(customerEmail);
	}

	@Override
	public boolean isExistsByCustomerMobileNumber(String customerMobileNumber) {
		return customerRepository.existsByCustomerMobileNumber(customerMobileNumber);
	}

	@Override
	public boolean isExistsByCustomerKYCNumber(String customerKYCNumber) {
		return customerRepository.existsByCustomerKYCNumber(customerKYCNumber);
	}

	@Override
	public Customer getCustomerbyCustomerId(long customerId) {
		return customerRepository.getById(customerId);
	}

	@Override
	public boolean isExistsByCustomerId(long customerId) {
		return customerRepository.existsById(customerId);
	}

}
