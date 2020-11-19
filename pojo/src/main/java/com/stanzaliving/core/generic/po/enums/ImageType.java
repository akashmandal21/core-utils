package com.stanzaliving.core.generic.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum ImageType {

	RECEIVED("Received Item", "receivedItem",true),
	INSTALLED("Installed Item", "installedItem",true),
	RETURNED("Returned Item", "returnedItem",false),
	REJECTED("Rejected Item", "rejectedItem",false);
	
	private String tabName;
	private String key;
	private boolean ok;


	private static List<ImageType> okTypes = new ArrayList(2);
	private static List<ImageType> nokTypes = new ArrayList(2);

	static{
		okTypes.add(RECEIVED);
		okTypes.add(INSTALLED);
		nokTypes.add(RETURNED);
		nokTypes.add(REJECTED);
	}
	public static List<ImageType> getOkTypes(){
		return okTypes;
	}

	public static List<ImageType> getNOkTypes(){
		return nokTypes;
	}
}
