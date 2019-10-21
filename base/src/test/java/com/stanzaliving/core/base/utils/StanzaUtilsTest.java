package com.stanzaliving.core.base.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StanzaUtilsTest {

	@Test
	public void testGenerateOtp() {

		int otp = StanzaUtils.generateOTP();

		assertTrue(otp >= 100000);
		assertTrue(otp < 1000000);
	}

	@Test
	public void testGenerateOtpOfLength4() {

		int otp = StanzaUtils.generateOTPOfLength(4);

		System.out.println("4 digit otp: " + otp);

		assertTrue(otp >= 1000);
		assertTrue(otp < 10000);
	}

	@Test
	public void testGenerateOtpOfLength6() {

		int otp = StanzaUtils.generateOTPOfLength(6);

		System.out.println("6 digit otp: " + otp);

		assertTrue(otp >= 100000);
		assertTrue(otp < 1000000);
	}

	@Test
	public void testGenerateDefaultOtpOfLength4() {

		int otp = StanzaUtils.generateDefaultOtpOfLength(4);

		System.out.println("4 digit default otp: " + otp);

		assertTrue(otp == 1234);
	}

	@Test
	public void testGenerateDefaultOtpOfLength6() {

		int otp = StanzaUtils.generateDefaultOtpOfLength(6);

		System.out.println("6 digit default otp: " + otp);

		assertTrue(otp == 123456);
	}
}