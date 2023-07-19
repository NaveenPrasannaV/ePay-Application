package com.cg.epay.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UPIPaymentDTO {
	private String UPIId;
	private String UPIPin;

	public String getUPIId() {
		return UPIId;
	}

	public void setUPIId(String uPIId) {
		UPIId = uPIId;
	}

	public String getUPIPin() {
		return UPIPin;
	}

	public void setUPIPin(String uPIPin) {
		UPIPin = uPIPin;
	}

}
