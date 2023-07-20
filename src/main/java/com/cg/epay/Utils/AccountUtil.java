package com.cg.epay.Utils;

import java.util.Date;
import java.util.Random;

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
	public static Date getCurrentDate() {
		// Get the current date
		return new Date();
	}

}
