/**
 * 
 */
package com.stanzaliving.core.base.common.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse<T> {

	private int page;

	private int records;

	private int totalPages;

	private long totalRecords;

	private List<T> data;

	public static <T> PageResponse<T> of(int page, int records, int totalPages, int totalRecords) {
		return new PageResponse<>(page, records, totalPages, totalRecords, new ArrayList<>());
	}

	public static <T> PageResponse<T> of(int page, int records, int totalPages, int totalRecords, List<T> data) {
		return new PageResponse<>(page, records, totalPages, totalRecords, data);
	}
}