package com.cg.epay.model;

import org.springframework.stereotype.Component;

@Component
public class PaymentStatusDTO {

	private String transactionId;
	private double transactionAmount;
	private String transactionMessage;

	public PaymentStatusDTO() {
		this.transactionId = "123";
		this.transactionAmount = 12.90;
		this.transactionMessage = "Message";
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionMessage() {
		return transactionMessage;
	}

	public void setTransactionMessage(String transactionMessage) {
		this.transactionMessage = transactionMessage;
	}

}
