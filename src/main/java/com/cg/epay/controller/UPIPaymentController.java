package com.cg.epay.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.epay.model.PaymentStatusDTO;

@RestController
public class UPIPaymentController {

	@GetMapping(path = "/demopay")
	@ResponseBody
	public ResponseEntity<PaymentStatusDTO> DemoUPIPayment() {
		PaymentStatusDTO paymentStatusDTO = new PaymentStatusDTO();
		return new ResponseEntity<>(paymentStatusDTO, HttpStatus.OK);
	}

}
