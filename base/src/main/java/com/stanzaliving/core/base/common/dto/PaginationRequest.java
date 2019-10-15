/**
 * 
 */
package com.stanzaliving.core.base.common.dto;

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
public class PaginationRequest {

	protected int pageNo = 1;

	protected int limit = 1000;

	public PaginationRequest(int page, int limit) {
		this.pageNo = page;
		this.limit = limit;
	}
}