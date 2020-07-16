package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 16-July-2020
 */

@Getter
@AllArgsConstructor
public enum CategoryDraftStatus {
	UNDER_DRAFT("Under Draft"),
	SUBMITTED("Submitted"),
	APPROVED("Approved"),
	REJECTED("Rejected");

	private String draftStatus;

}
