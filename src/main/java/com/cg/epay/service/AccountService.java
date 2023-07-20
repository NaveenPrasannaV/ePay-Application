package com.cg.epay.service;

import org.springframework.http.ResponseEntity;

public interface AccountService {

	ResponseEntity<String> createAccount(long customerId);

}
