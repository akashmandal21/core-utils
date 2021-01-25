package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.PageResponse;
import lombok.*;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 30-Sep-2020
 *
 * @version 1.0
 *
 * @param <T>
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DataCountPageResponse<T> extends PageResponse<T> {
	private Long dataComplete;

	private Long dataMissing;
}
