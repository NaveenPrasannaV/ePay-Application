package com.cg.epay.Utils;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Random;

public class DebitCardUtil {

	/*
	 * Generate a random 16-digit Debit Card number
	 */
	public static String generateRandomSixteenDigitCardNumber() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 16; i++) {
			int digit = random.nextInt(10);
			sb.append(digit);
		}
		return sb.toString();
	}

	/*
	 * This method will return year and month 10 years from now
	 */
	public static YearMonth getYearMonthTenYearsFromNow() {
		LocalDate currentDate = LocalDate.now();
		YearMonth yearMonthTenYearsFromNow = YearMonth.from(currentDate.plusYears(10));
		return yearMonthTenYearsFromNow;
	}

	/*
	 * This method will return random three digit CVV
	 */
	public static int generateRandomThreeDigitCVV() {
		// Create a Random object
		Random random = new Random();
		// Generate a random three-digit CVV (between 100 and 999)
		return random.nextInt(900) + 100;
	}

}
