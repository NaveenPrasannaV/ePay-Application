package com.cg.epay.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.cg.epay.Utils.AccountUtil;
import com.cg.epay.commonconstant.CommonConstants;

@Entity
public class Account {

	@Id
	private Long accountNumber;
	private String ifscCode;
	private double accountBalance;
	private LocalDate accountOpenDate;

	@ManyToOne
	private Customer customer;

	@OneToOne
	private DebitCard debitCard;

	@ManyToOne
	@JoinColumn(name = "upi_id")
	private DebitCard UPIId;

	public Account() {
		this.accountNumber = AccountUtil.generateRandomTwelveDigitAccountNumber();
		this.ifscCode = CommonConstants.IFSC_CODE;
		this.accountBalance = CommonConstants.INITIAL_ACCOUNT_BALANCE;
		this.accountOpenDate = AccountUtil.getCurrentDate();
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DebitCard getDebitCard() {
		return debitCard;
	}

	public void setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
	}

	public DebitCard getUPIId() {
		return UPIId;
	}

	public void setUPIId(DebitCard uPIId) {
		UPIId = uPIId;
	}

}
