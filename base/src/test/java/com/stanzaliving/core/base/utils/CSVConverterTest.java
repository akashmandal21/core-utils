package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.stanzaliving.core.base.utils.CSVConverter;

public class CSVConverterTest {

	@Test
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void testGetCSVStringListConditation1() {
		List list = new ArrayList<>();
		list.add("test");
		list.add(5);
		list.add(4.5);
		String actual = "test,5,4.5";
		String excepted = CSVConverter.getCSVString(list);
		assertThat(excepted).isNotNull().isNotEmpty();
		assertThat(actual).isEqualTo(excepted);
	}

	@Test
	@SuppressWarnings({ "rawtypes" })
	public void testGetCSVStringListConditation2() {
		List list = null;
		String excepted = CSVConverter.getCSVString(list);
		assertThat(excepted).isNotNull().isEmpty();
	}

	@Test
	public void testGetCSVStringListWithIdsArrayConditation1() {
		long[] array = { 1, 2, 3, 4, 5 };
		String actual = "1,2,3,4,5";
		String excepted = CSVConverter.getCSVString(array);
		assertThat(excepted).isNotNull().isNotEmpty();
		assertThat(actual).isEqualTo(excepted);
	}

	@Test
	public void testGetCSVStringListWithIdsArrayConditation2() {
		long[] array = null;
		String excepted = CSVConverter.getCSVString(array);
		assertThat(excepted).isNotNull().isEmpty();
	}

	@Test
	public void testGetCSVStringListWithIdsArrayConditation3() {
		long[] array = {};
		String excepted = CSVConverter.getCSVString(array);
		assertThat(excepted).isNotNull().isEmpty();
	}

	@Test
	public void testGetCSVStringIntArrayConditation1() {
		int[] array = { 1, 2, 3, 4, 5 };
		String actual = "1,2,3,4,5";
		String excepted = CSVConverter.getCSVString(array);
		assertThat(excepted).isNotNull().isNotEmpty();
		assertThat(actual).isEqualTo(excepted);
	}

	@Test
	public void testGetCSVStringIntArrayConditation2() {
		int[] array = null;
		String excepted = CSVConverter.getCSVString(array);
		assertThat(excepted).isNotNull().isEmpty();
	}

	@Test
	public void testGetCSVStringIntArrayConditation3() {
		int[] array = {};
		String excepted = CSVConverter.getCSVString(array);
		assertThat(excepted).isNotNull().isEmpty();
	}

	@Test
	public void testGetCSVStringStringArrayConditation1() {
		String[] ids = { "@", "test1", "test2", "test3" };
		String actual = "'@','test1','test2','test3'";
		String excepted = CSVConverter.getCSVString(ids);
		assertThat(excepted).isNotNull().isNotEmpty();
		assertThat(actual).isEqualTo(excepted);
	}

	@Test
	public void testGetCSVStringStringArrayConditation2() {
		String[] ids = null;
		String excepted = CSVConverter.getCSVString(ids);
		assertThat(excepted).isNotNull().isEmpty();
	}

	@Test
	public void testGetCSVStringStringArrayConditation3() {
		String[] ids = {};
		String excepted = CSVConverter.getCSVString(ids);
		assertThat(excepted).isNotNull().isEmpty();
	}
}