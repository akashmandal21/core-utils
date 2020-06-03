package com.stanzaliving.core.sqljpa.specification.utils;

import java.util.Objects;

import com.stanzaliving.core.dto.PageAndSortDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;

import lombok.experimental.UtilityClass;

/**
 * An utility class for spring data JPA {@link Page}.
 * 
 * @author debendra.dhinda
 * @since 14-Jan-2020
 */

@UtilityClass
public class PaginationUtility {

	/**
	 * Returns {@link Pageable} based on the supplied parameters.
	 * 
	 * @param pageNo
	 *            Page number
	 * @param limit
	 *            Page limit(No.of records per page)
	 * @param sortBy
	 *            SortBy attribute name
	 * @param sortDirection
	 *            Sorting direction(e.g. Direction.ASC)
	 * 
	 * 
	 * @author debendra.dhinda
	 *
	 * @refactoredBy piyush srivastava
	 *
	 * @refactoredOn 12-May-2020
	 */

	public int correctLimit(int limit) {
		limit = Math.max(1, limit);
		limit = Math.min(1000, limit);
		return limit;
	}

	public int correctPageNo(int pageNo) {
		pageNo = Math.max(1, pageNo);
		return pageNo;
	}

	public Pageable getPageRequest(int pageNo, int limit, String sortBy, Direction sortDirection) {
		limit = correctLimit(limit);
		pageNo = correctPageNo(pageNo);

		if (StringUtils.isNotBlank(sortBy) && Objects.nonNull(sortDirection)) {
			return PageRequest.of(pageNo - 1, limit, sortDirection, sortBy);
		} else {
			return PageRequest.of(pageNo - 1, limit);
		}
	}

	public Pageable getPageRequest(int pageNo, int limit) {
		return getPageRequest(pageNo, limit, null, null);
	}

	@Deprecated
	public Pageable getPageRequset(int pageNo, int limit) {
		return getPageRequest(pageNo, limit);
	}

	@Deprecated
	public Pageable getPageRequset(int pageNo, int limit, String sortBy, Direction sortDirection) {
		return getPageRequset(pageNo, limit, sortBy, sortDirection);
	}

	public Pageable getPageRequest(PageAndSortDto pageAndSortDto) {
		return getPageRequest(pageAndSortDto.getPageNo(), pageAndSortDto.getLimit(), pageAndSortDto.getSortBy(), Direction.valueOf(pageAndSortDto.getSortOrder()));
	}

	public Pageable getPageRequsetMultipleSortKeys(int pageNo, int limit, Direction sortDirection, String... properties) {
		pageNo = correctPageNo(pageNo);
		limit = correctLimit(limit);
		return PageRequest.of(pageNo - 1, limit, sortDirection, properties);
	}

}