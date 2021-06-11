package com.stanzaliving.website.enums;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ImageTags implements Comparator<ImageTags> {
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

	@Override
	public int compare(ImageTags tag1, ImageTags tag2) {

		if (tag1.equals(ImageTags.OTHERS)) {
			return 1;
		}
		if (tag2.equals(ImageTags.OTHERS)) {
			return -1;
		}

		return tag1.compareTo(tag2);
	}
}
