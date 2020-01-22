package com.stanzaliving.core.sqljpa.specification.utils;

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
 * */

@UtilityClass
public class PaginationUtility {

	/**
	 * Returns {@link Pageable} based on the supplied parameters.
	 * 
	 * @param pageNo        Page number
	 * @param limit         Page limit(No.of records per page)
	 * @param sortBy        SortBy attribute name
	 * @param sortDirection Sorting direction(e.g. Direction.ASC)
	 * 
	 * 
	 * @author debendra.dhinda
	 */
	public Pageable getPageRequset(int pageNo, int limit, String sortBy, Direction sortDirection) {

		Pageable pagination = PageRequest.of(0, limit, sortDirection, sortBy);
		if (pageNo > 0 && limit > 0 && limit < 1000) {
			pagination = PageRequest.of(pageNo - 1, limit, sortDirection, sortBy);
		}
		return pagination;
	}
}
