package com.cg.epay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.epay.exception.EntityAlreadyExistsException;
import com.cg.epay.model.CustomerDTO;
import com.cg.epay.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping(path = "/customerSignup", consumes = "application/json")
	@ResponseBody
	public ResponseEntity<String> customerSignUp(@RequestBody CustomerDTO customerDTO) throws EntityAlreadyExistsException {
		return customerService.customerSignUp(customerDTO);
	}
}
