package com.cg.epay.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.epay.dao.AccountDao;
import com.cg.epay.dao.DebitCardDao;
import com.cg.epay.service.DebitCardService;

@Service
public class DebitCardServiceImpl implements DebitCardService {

	@Autowired
	DebitCardDao debitCardDao;

	@Autowired
	AccountDao accountDao;

	/*
	 * 1. check if account is exists 2. get account entity 3. create a Debit card
	 * entity object 4. Save debit card into account 5. save both debit card and
	 * update account object in DB.
	 */
	public ResponseEntity<String> addDebitCardToAnAccount(Long accountNumber) {

		return null;

	}

}
