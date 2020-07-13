package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LatLongDistanceUtilTest {

	@Test
	public void testDistance() {
		double expected = LatLongDistanceUtil.distance(28.572799, 77.240115, 28.573898, 77.204220, 'K');
		assertThat(expected).isEqualTo(3.507179386741271);
	}

	@Test
	public void testDistanceWithUnitN() {
		double expected = LatLongDistanceUtil.distance(28.572799, 77.240115, 28.573898, 77.204220, 'N');
		assertThat(expected).isEqualTo(1.8924695897496862);
	}
}