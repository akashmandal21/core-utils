/**
 * 
 */
package com.stanzaliving.core.paytm.pg.crypto.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

import org.apache.commons.lang3.StringUtils;

import lombok.experimental.UtilityClass;

/**
 * @author naveen
 *
 * @date 16-Jul-2018
 */
@UtilityClass
public class CryptoUtils {

	public static String getHashFromSHA(String value) throws NoSuchAlgorithmException {
		String hashValue = "";

		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		hashValue = byteArray2Hex(messageDigest.digest(value.getBytes()));

		return hashValue;
	}

	private static String byteArray2Hex(byte[] hash) {
		try (Formatter formatter = new Formatter()) {

			byte[] arrayOfByte = hash;
			int j = hash.length;
			for (int i = 0; i < j; i++) {
				byte b = arrayOfByte[i];

				formatter.format("%02x", Byte.valueOf(b));
			}
			return formatter.toString();
		}
	}

	public static String generateRandomString(int length) {
		String alphanumericKey = "9876543210ZYXWVUTSRQPONMLKJIHGFEDCBAabcdefghijklmnopqrstuvwxyz!@#$&_";

		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			Double ndx = Math.random() * alphanumericKey.length();
			sb.append(alphanumericKey.charAt(ndx.intValue()));
		}

		return sb.toString();
	}

	public static String getSHA256(String value) {

		String hashValue = "";

		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			hashValue = byteArray2Hex(messageDigest.digest(value.getBytes()));

		} catch (NoSuchAlgorithmException e) {
			throw new SecurityException(e.getMessage(), e);
		}

		return hashValue;
	}

	public static String getLastNChars(String inputString, int subStringLength) {
		if (StringUtils.isNoneBlank(inputString)) {

			int length = inputString.length();

			if (length <= subStringLength) {
				return inputString;
			}

			int startIndex = length - subStringLength;
			return inputString.substring(startIndex);
		}

		return "";
	}
}