package com.stanzaliving.core.base.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

import java.awt.print.Pageable;
import java.util.Objects;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 19-Jan-2021
 *
 * migrated the code from sqljpa module to here to make these func independent
 */

@UtilityClass
public class PaginationUtil {

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

}