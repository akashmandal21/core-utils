package com.stanzaliving.banner.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum PromotionStatus {

	ACTIVE("active"), INACTIVE("inactive"), DRAFT("draft");
	
	private String displayName;
}
