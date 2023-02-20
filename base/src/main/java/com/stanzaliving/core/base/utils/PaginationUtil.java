package com.stanzaliving.core.base.utils;

import lombok.experimental.UtilityClass;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 19-Jan-2021
 *
 *       migrated the code from sqljpa module to here to make these func independent
 */

@UtilityClass
public class PaginationUtil {

	public int correctLimit(int limit) {
		limit = Math.max(1, limit);
		limit = Math.min(10000, limit);
		return limit;
	}

	public int correctPageNo(int pageNo) {
		pageNo = Math.max(1, pageNo);
		return pageNo;
	}

	public int correctPageNoForElastic(int pageNo) {
		return Math.max(0, pageNo) +1 ;
	}

}