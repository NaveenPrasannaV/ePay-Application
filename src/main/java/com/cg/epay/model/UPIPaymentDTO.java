package com.cg.epay.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UPIPaymentDTO {
	private String UPIId;
	private String UPIPin;
}
