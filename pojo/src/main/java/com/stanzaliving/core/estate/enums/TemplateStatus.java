package com.stanzaliving.core.estate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TemplateStatus {
	
	IN_DRAFT("In Draft","#E6E9EA","#7A7D7E"),
	APPROVED("Approved", "#EDFFF5","#60C3AD");
	
	private String statusText;
	private String bgColor;
	private String textColor;

}
