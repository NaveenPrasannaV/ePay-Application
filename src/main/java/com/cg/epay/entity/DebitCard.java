package com.cg.epay.entity;

import java.time.YearMonth;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.cg.epay.Utils.DebitCardUtil;
import com.cg.epay.commonconstant.CommonConstants;

@Entity
public class DebitCard {

	/*
	 * Auto generated by separate method DebitCardUtil.generateRandomCardNumber
	 */
	@Id
	private String cardNumber;
	private YearMonth cardExpiryDate;
	private int CVV;
	private String cardIssuer;

	@OneToOne(mappedBy = "debitCard", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Account account;

	public DebitCard() {
		this.cardNumber = DebitCardUtil.generateRandomSixteenDigitCardNumber();
		this.cardExpiryDate = DebitCardUtil.getYearMonthTenYearsFromNow();
		this.CVV = DebitCardUtil.generateRandomThreeDigitCVV();
		this.cardIssuer = DebitCardUtil.getRandomCardType();
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public YearMonth getCardExpiryDate() {
		return cardExpiryDate;
	}

	public void setCardExpiryDate(YearMonth cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	public String getCardIssuer() {
		return cardIssuer;
	}

	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
