package com.stanzaliving.core.generic.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ImageType {

	RECEIVED("Received Item", "receivedItem"),
	INSTALLED("Installed Item", "installedItem"), 
	RETURNED("Returned Item", "returnedItem"), 
	REJECTED("Rejected Item", "rejectedItem");
	
	private String tabName;
	private String key;
	
	
}
