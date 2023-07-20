package com.cg.epay.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.epay.dao.AccountDao;
import com.cg.epay.entity.Account;
import com.cg.epay.repository.AccountRepository;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public String saveAccount(Account account) {
		accountRepository.save(account);
		return "Account Created Successfully!";
	}

}
