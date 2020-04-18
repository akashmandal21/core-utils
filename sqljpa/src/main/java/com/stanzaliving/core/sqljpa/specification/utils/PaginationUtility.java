package com.stanzaliving.core.sqljpa.specification.utils;

import java.util.Objects;

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
	 */
	public Pageable getPageRequset(int pageNo, int limit, String sortBy, Direction sortDirection) {

		Pageable pagination = null;

		if (StringUtils.isNotBlank(sortBy) && Objects.nonNull(sortDirection)) {

			if (pageNo > 0 && limit > 0 && limit < 1000) {
				pagination = PageRequest.of(pageNo - 1, limit, sortDirection, sortBy);
			} else {
				pagination = PageRequest.of(0, 10, sortDirection, sortBy);
			}

		} else {
			pagination = getPageRequset(pageNo, limit);
		}

		return pagination;
	}

	public Pageable getPageRequsetMultipleSortKeys(int pageNo, int limit, Direction sortDirection, String... properties) {

		if (pageNo > 0 && limit > 0 && limit < 1000) {
			return PageRequest.of(pageNo - 1, limit, sortDirection, properties);
		} else {
			return PageRequest.of(0, limit, sortDirection, properties);
		}
	}

	public Pageable getPageRequset(int pageNo, int limit) {

		Pageable pagination = null;

		if (pageNo > 0 && limit > 0 && limit < 1000) {
			pagination = PageRequest.of(pageNo - 1, limit);
		} else
			pagination = PageRequest.of(0, 10);

		return pagination;
	}

}