package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ImageTags {
	LIVINGAREA("Living Area"),
	DININGAREA("Dining Area"),
	LOBBY("Lobby"),
	COMMONAREA("common Area"),
	RECEPTION("Reception"),
	LIFT("Left"),
	ROOM("Room"),
	KITCHEN("Kitchen");
	
	public String imageTagName;
}
