package com.cg.epay.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.epay.Utils.CustomerUtil;
import com.cg.epay.dao.CustomerDao;
import com.cg.epay.exception.EntityAlreadyExistsException;
import com.cg.epay.exception.ValidationException;
import com.cg.epay.model.CustomerDTO;
import com.cg.epay.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Override
	public ResponseEntity<String> customerSignUp(CustomerDTO customerDTO) throws EntityAlreadyExistsException {
		if (!CustomerUtil.isValidCustomerName(customerDTO.getCustomerName())) {
			throw new ValidationException("Invalid Customer Name!");
		}

		if (!CustomerUtil.isValidMobileNumber(customerDTO.getCustomerMobileNumber())) {
			throw new ValidationException("Invalid mobile number!");
		}

		if (!CustomerUtil.isValidKYCNumber(customerDTO.getCustomerKYCNumber())) {
			throw new ValidationException("Invalid KYC number!");
		}

		if (!CustomerUtil.isValidPassword(customerDTO.getPassword())) {
			throw new ValidationException("Invalid password!");
		}

		if (!CustomerUtil.isValidEmail(customerDTO.getCustomerEmail())) {
			throw new ValidationException("Invalid email!");
		}
		if (customerDao.isExistsByCustomerMobileNumber(customerDTO.getCustomerMobileNumber())) {
			throw new EntityAlreadyExistsException("Mobile already exists!");
		}
		if (customerDao.isExistsByCustomerKYCNumber(customerDTO.getCustomerKYCNumber())) {
			throw new EntityAlreadyExistsException("KYC Details already exists!");
		}
		if (customerDao.isExistsByCustomerEmail(customerDTO.getCustomerEmail())) {
			throw new EntityAlreadyExistsException("Email already exists!");
		}
		return new ResponseEntity<>(
				customerDao.saveCustomer(CustomerUtil.convertCustomerDTOToCustomerEntity(customerDTO)), HttpStatus.OK);
	}

}
