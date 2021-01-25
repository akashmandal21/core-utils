package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.stanzaliving.core.base.common.dto.CountryDto;

public class PhoneNumberUtilsTest {

	@Test
	public void testIsValidMobileByCountryCodeConditation1() {

		boolean expected = PhoneNumberUtils.isValidMobileForCountry("1234567890", "IN");
		assertThat(expected).isFalse();
	}

	@Test
	public void testIsValidMobileByCountryCodeConditation2() {

		boolean expected = PhoneNumberUtils.isValidMobileForCountry(" ", "IN");
		assertThat(expected).isFalse();
	}

	@Test
	public void testIsValidMobileByCountryCodeConditation3() {

		boolean expected = PhoneNumberUtils.isValidMobileForCountry("7358623569", " ");
		assertThat(expected).isFalse();
	}

	@Test
	public void testIsValidMobileByCountryCodeConditation4() {

		boolean expected = PhoneNumberUtils.isValidMobileForCountry(" ", " ");
		assertThat(expected).isFalse();
	}

	@Test
	public void testIsValidMobileByCountryCodeConditation5() {

		boolean expected = PhoneNumberUtils.isValidMobileForCountry("7358623569", "US");
		assertThat(expected).isFalse();
	}

	@Test
	public void testIsValidMobileByCountryCodeConditation6() {

		boolean expected = PhoneNumberUtils.isValidMobileForCountry("7358623569", "IN");
		assertThat(expected).isTrue();
	}

	@Test
	public void testGetAllCountryCodes() {

		List<CountryDto> countryDtos = PhoneNumberUtils.getAllCountries();

		assertThat(countryDtos).isNotEmpty();
	}

	@Test
	public void testIsPossiblePhone() throws NumberParseException {

		PhoneNumberUtil phoneNumberUtil = PhoneNumberUtils.getPhoneNumberUtil();

		PhoneNumber phoneNumber = phoneNumberUtil.parse("+919716554117", "IN");

		System.out.println(phoneNumber);

		boolean possibleMobile = phoneNumberUtil.isPossibleNumberForType(phoneNumber, PhoneNumberType.MOBILE);

		PhoneNumberType phoneNumberType = phoneNumberUtil.getNumberType(phoneNumber);

		String significantNumber = phoneNumberUtil.getNationalSignificantNumber(phoneNumber);

		System.out.println(phoneNumber.getNationalNumber() + " Possible Mobile Status: " + possibleMobile + " for type: " + phoneNumberType + " and Significant Number: " + significantNumber);

		assertThat(possibleMobile && (PhoneNumberType.MOBILE == phoneNumberType || PhoneNumberType.FIXED_LINE_OR_MOBILE == phoneNumberType)).isTrue();

	}

}