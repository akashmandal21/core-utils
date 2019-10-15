/**
 * 
 */
package com.stanzaliving.core.base.utils;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

import com.stanzaliving.core.base.StanzaConstants;

import lombok.experimental.UtilityClass;

/**
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@UtilityClass
public class StanzaUtils {

	public static String hideSecret(String secretString) {

		if (StringUtils.isNotBlank(secretString)) {
			return "******";
		}

		return StringUtils.EMPTY;
	}

	public double roundOffToNine(double number) {
		double lastTwoDigits = number % 100;

		if (lastTwoDigits > 0 && lastTwoDigits < 49) {
			number = number - lastTwoDigits + 49;
		} else {
			number = number - lastTwoDigits + 99;
		}
		return number;
	}

	public static String convertIntegerNumberToString(int number) {
		return " [" + number + "] ";
	}

	public static String convertDoublePriceToString(double price) {
		return " [" + price + "] ";
	}

	public static String getOccupancyString(int occupancy) {

		switch (occupancy) {
			case 1:
				return "[Single]";
			case 2:
				return "[Double]";
			case 3:
				return "[Triple]";
			case 4:
				return "[Four]";
			case 5:
				return "[Five]";
			default:
				return "[" + occupancy + "]";
		}

	}

	public static int generateOTP() {
		return ThreadLocalRandom.current().nextInt(100000, 1000000);
	}

	/**
	 * Return a random integer number between the given range inclusive @start and excluding @end
	 * 
	 * @param start
	 *            - the smallest random number required
	 * @param end
	 *            - one less than the maximum random number required
	 * @return random integer number between the given range inclusive @start and excluding @end
	 * @throws IllegalArgumentException
	 *             - if start is greater than equal to end
	 */
	public static int getRandomNumberBetweenRange(int start, int end) {
		return ThreadLocalRandom.current().nextInt(start, end);
	}

	public static String trimmedOrNull(String str) {
		return StringUtils.isBlank(str) ? null : str.trim();
	}

	public static boolean isValidEmail(String email) {
		if (StringUtils.isBlank(email)) {
			return false;
		}
		return EmailValidator.getInstance().isValid(email);
	}

	public static String generateUniqueId(int length) {
		return RandomStringUtils.randomAlphanumeric(length).toUpperCase();
	}

	public static String generateUniqueId() {
		return UUID.randomUUID().toString();
	}

	public static String generateUniqueEmailId() {
		return generateUniqueId().replaceAll("-", "") + "@stanzaliving.com";
	}

	public static double roundToPlaces(double value, int places) {
		double numberToDivide = 1;

		while (places > 0) {
			numberToDivide *= 10;
			places--;
		}

		Double number = Double.valueOf(numberToDivide);
		return Math.round(value * number) / number;
	}

	public static double roundOff(Double price) {

		if (price != null) {
			return roundToPlaces(price, StanzaConstants.PRICE_ROUND_OFF_DIGITS);
		}

		return 0d;
	}

}