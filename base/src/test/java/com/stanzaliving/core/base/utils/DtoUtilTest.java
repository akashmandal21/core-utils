package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.stanzaliving.core.base.utils.DtoUtil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class DtoUtilTest {

	@Test
	public void testNonNullValueConditationIf() {

		String expected = DtoUtil.nonNullValue("test", "default");

		assertThat(expected).isNotNull().isNotEmpty().isEqualTo("test");
	}

	@Test
	public void testNonNullValueConditationElse() {

		String expected = DtoUtil.nonNullValue(null, "default");

		assertThat(expected).isNotNull().isNotEmpty().isEqualTo("default");
	}

	@Test
	public void testConvertByCopyWithoutException() {

		TestDto dto = new TestDto("test");

		TestDto entity = DtoUtil.convertByCopy(dto, TestDto.class);

		assertThat(entity).isNotNull().hasFieldOrPropertyWithValue("name", "test");

	}

	@Test
	public void testConvertByCopyWithException() {

		TestDto1 dto = new TestDto1();

		TestDto1 entity = DtoUtil.convertByCopy(dto, TestDto1.class);

		assertThat(entity).isNull();

	}

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class TestDto {

		private String name;
	}

	public static class TestDto1 {

		private TestDto1() {
		}

	}

}