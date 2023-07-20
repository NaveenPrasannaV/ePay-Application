package com.cg.epay.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.epay.Utils.AccountUtil;
import com.cg.epay.dao.AccountDao;
import com.cg.epay.dao.CustomerDao;
import com.cg.epay.entity.Account;
import com.cg.epay.entity.Customer;
import com.cg.epay.exception.ValidationException;
import com.cg.epay.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	CustomerDao customerDao;
	@Autowired
	AccountDao accountDao;

	@Override
	public ResponseEntity<String> createAccount(long customerId) {
		if (!customerDao.isExistsByCustomerId(customerId)) {
			throw new ValidationException("Invalid Customer Id!");
		}
		Customer customer = customerDao.getCustomerbyCustomerId(customerId);
		Account account = AccountUtil.creareAccount(customer);
		return new ResponseEntity<>(accountDao.saveAccount(account), HttpStatus.OK);
	}

}
