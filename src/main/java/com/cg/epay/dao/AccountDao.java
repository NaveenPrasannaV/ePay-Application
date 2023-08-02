package com.cg.epay.dao;

import com.cg.epay.entity.Account;

public interface AccountDao {

	String saveAccount(Account account);

	boolean existsByAccountNumber(Long accountNumber);

	int countAccountByCustomerId(Long customerId);

}
