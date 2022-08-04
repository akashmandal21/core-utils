package com.stanzaliving.banner.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum PageSection {

	FEATURED_DEALS("Featured Deals"), SPECIAL_DEALS("Special Deals"), POPULAR_EVENTS("Popular Events");
	
	private String displayName;
}
