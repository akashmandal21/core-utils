package com.stanzaliving.core.estate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TemplateParentKey {

	PRICING("Pricing Details"),
	OTHERS("Other Details");
	
	private String parentKey;
}
