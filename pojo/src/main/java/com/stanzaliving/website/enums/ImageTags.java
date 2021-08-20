package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ImageTags {
	COMMONAREA("Common Area"),
	DININGAREA("Dining Area"),
	KITCHEN("Kitchen"),
	LIFT("Lift"),
	LIVINGAREA("Living Area"),
	LOBBY("Lobby"),
	RECEPTION("Reception"),
	ROOM("Room"),
	OTHERS("Others");
	
	public String imageTagName;
}
