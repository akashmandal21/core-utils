package com.stanzaliving.core.estate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SalesReviewStatus {

	IN_DRAFT("In-Draft"),
	SUBMITTED("Sales Review Submitted"),
	APPROVED("Sales Review Approved"),
	SENT_BACK("Sent Back");
	
	private String statusText;
}
