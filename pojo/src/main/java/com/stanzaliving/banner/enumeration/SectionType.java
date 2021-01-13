package com.stanzaliving.banner.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum SectionType {

	CAROUSEL("Carousel"), STORY_WIDGET("Story Widget");
	
	private String displayName;
}
