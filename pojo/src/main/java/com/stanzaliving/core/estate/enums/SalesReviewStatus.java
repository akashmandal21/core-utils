package com.stanzaliving.core.estate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SalesReviewStatus {

	IN_DRAFT("In-Draft", "#E6E9EA", "#7A7D7E"),
	SUBMITTED("Sales Review Submitted", "#FFEAB6", "#FFB701"),
	APPROVED("Sales Review Approved", "#B8E0FF", "#5FC4F5"),
	SENT_BACK("Sent Back", "#FFF1F1", "#F55F71"),
	PROPERTY_DROPPED("Property Dropped", "#F0F2F2", "#7A7D7E");
	
	private String statusText;
	
	private String bgColor;
	
	private String textColor;
}
