package com.cg.epay.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class UPIPayment {
	
	@Id
	private String UPIId;
	private String UPIPin;

	@OneToMany(mappedBy = "UPIId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Account> accountList;

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

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

}
