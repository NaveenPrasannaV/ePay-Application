package com.cg.epay.service;

import org.springframework.http.ResponseEntity;

import com.cg.epay.exception.EntityAlreadyExistsException;

public interface AccountService {

	ResponseEntity<String> createAccount(long customerId) throws EntityAlreadyExistsException;

	Long generateRandomTwelveDigitAccountNumber();

}
