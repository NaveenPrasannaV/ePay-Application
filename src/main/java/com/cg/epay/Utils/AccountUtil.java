package com.cg.epay.Utils;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

import com.cg.epay.entity.Account;
import com.cg.epay.entity.Customer;
import com.cg.epay.entity.DebitCard;
import com.cg.epay.factory.ObjectFactory;

public class AccountUtil {

	/*
	 * This method will generate a random 12 digit Account number
	 */
	public static Long generateRandomTwelveDigitAccountNumber() {
		// Create a Random object
		Random random = new Random();
		// Generate a random 12-digit account number
		return 1_000_000_000_000L + random.nextInt(9_000_000);
	}

	/*
	 * Return current date
	 */
	public static LocalDate getCurrentDate() {
		// Get the current date
		return LocalDate.now();
	}

	public static Account creareAccount(Customer customer) {
		Account account = ObjectFactory.createObject(Account::new);
		account.setCustomer(customer);
		return account;

	}

}
