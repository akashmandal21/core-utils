package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StanzaParseUtilsTest {

	@Test
	public void testGetIntValue() {
		int expected = StanzaParseUtils.getIntValue("4");
		assertThat(expected).isEqualTo(4);
	}
	
	@Test
	public void testGetIntValueIf() {
		int expected = StanzaParseUtils.getIntValue("A");
		assertThat(expected).isEqualTo(0);
	}

	@Test
	public void testGetLongValue() {
		long expected = StanzaParseUtils.getLongValue("400000000");
		assertThat(expected).isEqualTo(400000000);
	}
	
	@Test
	public void testGetLongValueIf() {
		long expected = StanzaParseUtils.getLongValue("40000000A");
		assertThat(expected).isEqualTo(0);
	}

	@Test
	public void testGetFloatValue() {
		float expected = StanzaParseUtils.getFloatValue("4.00");
		assertThat(expected).isEqualTo(4.0f);
	}
	
	@Test
	public void testGetFloatValueIf() {
		float expected = StanzaParseUtils.getFloatValue("4.00AS");
		assertThat(expected).isEqualTo(0);
	}

	@Test
	public void testGetDoubleValue() {
		double expected = StanzaParseUtils.getDoubleValue("4.00");
		assertThat(expected).isEqualTo(4.0d);
	}
	
	@Test
	public void testGetDoubleValueIf() {
		double expected = StanzaParseUtils.getDoubleValue("4.00DF");
		assertThat(expected).isEqualTo(0);
	}
}
