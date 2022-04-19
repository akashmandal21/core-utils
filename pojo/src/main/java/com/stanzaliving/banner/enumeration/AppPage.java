package com.stanzaliving.banner.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum AppPage {

	HOME_PAGE("Home Page"), 
	FOOD_PAGE("Food Page"), 
	DEALS_PAGE("Deals Page"), 
	MYSTAY_PAGE("My Stay Page"),
	SUPPORT_HOME_PAGE("Support Home Page"),
	COMMUNITY_PAGE("Community Page"),
	EVENT_DETAIL_PAGE("Event Detail Page");

	private String displayName;
}
