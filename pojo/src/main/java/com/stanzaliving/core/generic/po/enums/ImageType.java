package com.stanzaliving.core.generic.po.enums;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ImageType {

	RECEIVED("receivedItem"),
	INSTALLED("installedItem"), 
	RETURNED("returnedItem"), 
	REJECTED("rejectedItem");
	
	private String key;
	
	
}
