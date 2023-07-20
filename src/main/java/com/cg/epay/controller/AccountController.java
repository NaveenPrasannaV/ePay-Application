package com.cg.epay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.epay.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@GetMapping(path = "/createaccount/{customerId}")
	@ResponseBody
	public ResponseEntity<String> createAccount(@PathVariable("customerId") long customerId) {
		return accountService.createAccount(customerId);
	}

}
