/**
 * 
 */
package com.stanzaliving.core.base.utils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
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

	private static RoundingMode ROUNDING_MODE =RoundingMode.HALF_EVEN;
	private static int SCALE =3;

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

	public static int generateOTPOfLength(int length) {
		return (int) ThreadLocalRandom.current().nextDouble(Math.pow(10, length - 1), Math.pow(10, length));
	}

	public static int generateDefaultOtpOfLength(int length) {

		int otp = 0;
		int count = 1;

		for (int i = 0; i < length; i++) {

			otp = (otp * 10) + count;

			count++;
		}

		return otp;
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

	public static List<String> getSplittedListOnComma( String input ){
		
		if(Objects.isNull(input)) {
			return null;
		}
		
		return Arrays.asList(input.split(","));
	}





	/***
	 * Returns the percentage value of the supplied number as {@link BigDecimal}.
	 * @param number {@link Number}
	 * @return {@link BigDecimal}
	 * @author debendra.dhinda
	 * */
	public static BigDecimal getPercentageValueOf(Number number) {
		return getBigDecimalValueOf(number).divide(getBigDecimalValueOf(100),StanzaUtils.SCALE,StanzaUtils.ROUNDING_MODE);
	}

	/***
	 * Returns the percentage value of the supplied string as {@link BigDecimal}.
	 * @param number {@link String}
	 * @return {@link BigDecimal}
	 * @author debendra.dhinda
	 * */
	public static BigDecimal getPercentageValueOf(String number) {
		return getBigDecimalValueOf(number).divide(getBigDecimalValueOf(100),StanzaUtils.SCALE,StanzaUtils.ROUNDING_MODE);
	}

	/***
	 * Returns the {@link BigDecimal}  representations of the supplied number.
	 * Translates the number representation of a {@code BigDecimal}
	 * into a {@code BigDecimal}, accepting the same number as the
	 * {@link #BigDecimal(String)} constructor, with rounding
	 * according to the context {@link MathContext.DECIMAL128}.
	 *
	 * @param  number string representation of a {@code BigDecimal}.
	 * @author debendra.dhinda
	 * */
	public static BigDecimal getBigDecimalValueOf(Number number) {
		//return new BigDecimal(Double.toString(value));
		return new BigDecimal(number.toString(), MathContext.DECIMAL128);
	}

	/***
	 * Returns the {@link BigDecimal}  representations of the supplied string.
	 * Translates the number representation of a {@code BigDecimal}
	 * into a {@code BigDecimal}, accepting the same number as the
	 * {@link #BigDecimal(String)} constructor, with rounding
	 * according to the context {@link MathContext.DECIMAL128}.
	 *
	 * @param  number string representation of a {@code BigDecimal}.
	 * @author debendra.dhinda
	 * */
	public static BigDecimal getBigDecimalValueOf(String value) {
		//return new BigDecimal(Double.toString(value));
		return new BigDecimal(value, MathContext.DECIMAL128);
	}



	/**
	 * Used {@link Math} class's {@code ceil()} method for rounding the supplied {@link BigDecimal} value.
	 * 
	 * @param value {@link BigDecimal} value to be ceiled
	 * @return value
	 * @author debendra.dhinda
	 * */
	public static Double roundOff(BigDecimal value) {
		//return  (value!=null)? value.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue() :0;
		return (value!=null) ? Math.ceil(value.doubleValue()) :0;
	}




}