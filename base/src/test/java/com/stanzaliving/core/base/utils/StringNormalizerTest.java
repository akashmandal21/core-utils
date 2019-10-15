package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.stanzaliving.core.base.utils.StringNormalizer;

public class StringNormalizerTest {

	@Test
	public void testNormalizeStringConditation1() {

		String expected = StringNormalizer.normalizeString(" this,is a test@string ");

		assertThat("this is a teststring").isNotEmpty().isEqualTo(expected);
	}

	@Test
	public void testNormalizeStringConditation2() {

		String expected = StringNormalizer.normalizeString("");

		assertThat(expected).isEmpty();
	}

	@Test
	public void testnormalizeStringForRegexCondation1() {

		String expected = StringNormalizer.normalizeStringForRegex("this is text", "this\\s+is\\s+text", "replaced");

		assertThat(expected).isNotNull().isNotEmpty();

		assertThat(expected).isEqualTo("replaced");
	}

	@Test
	public void testnormalizeStringForRegexCondation2() {

		String expected = StringNormalizer.normalizeStringForRegex("this is text", "this\\s+is\\s+text", null);

		assertThat(expected).isNotNull().isEmpty();

	}

	@Test
	public void testnormalizeStringForRegexCondation3() {

		String expected = StringNormalizer.normalizeStringForRegex("", "this\\s+is\\s+text", "test");

		assertThat(expected).isNotNull().isEmpty();

	}

	@Test
	public void testnormalizeStringForRegexCondation4() {

		String expected = StringNormalizer.normalizeStringForRegex("this is text", " ", "test");

		assertThat(expected).isNotNull().isNotEmpty();

		assertThat(expected).isEqualTo("this is text");

	}

}