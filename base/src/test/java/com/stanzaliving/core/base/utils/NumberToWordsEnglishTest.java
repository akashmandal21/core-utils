package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.stanzaliving.core.base.utils.NumberToWordsEnglish;

public class NumberToWordsEnglishTest {

	@Test
	public void testConvertConditation1() {

		String actual = "Twelve Crore Thirty Four Lakh Fifty Six Thousand Seven Hundred Eighty Nine";

		String expected = NumberToWordsEnglish.convert(123456789);

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

	@Test
	public void testConvertConditation2() {

		String actual = "One Crore Twenty Three Lakh Forty Five Thousand Six Hundred Seventy Eight";

		String expected = NumberToWordsEnglish.convert(12345678);

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

	@Test
	public void testConvertConditation3() {

		String actual = "Twelve Lakh Thirty Four Thousand Five Hundred Sixty Seven";

		String expected = NumberToWordsEnglish.convert(1234567);

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

	@Test
	public void testConvertConditation4() {

		String actual = "One Lakh Twenty Three Thousand Four Hundred Fifty Six";

		String expected = NumberToWordsEnglish.convert(123456);

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

	@Test
	public void testConvertConditation5() {

		String actual = "Twelve Thousand Three Hundred Forty Five";

		String expected = NumberToWordsEnglish.convert(12345);

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

	@Test
	public void testConvertConditation6() {

		String actual = "One Thousand Two Hundred Thirty Four";

		String expected = NumberToWordsEnglish.convert(1234);

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

	@Test
	public void testConvertConditation7() {

		String actual = "One Hundred Twenty Three";

		String expected = NumberToWordsEnglish.convert(123);

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

	@Test
	public void testConvertConditation8() {

		String actual = "zero";

		String expected = NumberToWordsEnglish.convert(0);

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

}