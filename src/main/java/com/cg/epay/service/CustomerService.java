package com.cg.epay.service;

import org.springframework.http.ResponseEntity;

import com.cg.epay.exception.EntityAlreadyExistsException;
import com.cg.epay.model.CustomerDTO;

public interface CustomerService {

	ResponseEntity<String> customerSignUp(CustomerDTO customerDTO) throws EntityAlreadyExistsException;

}
