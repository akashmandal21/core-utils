package com.stanzaliving.banner.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum SectionType {

	CAROUSEL("Carousel"), 
	STORY_WIDGET("Story Widget"), 
	STORY_WIDGET_WITH_BANNER("Story Widget With Banner"),
	POSTER_CAROUSEL("Poster Carousel");

	private String displayName;
}
