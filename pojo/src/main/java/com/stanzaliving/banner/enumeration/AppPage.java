package com.stanzaliving.banner.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum AppPage {

	HOME_PAGE("Home Page"), FOOD_PAGE("Food Page"), DEALS_PAGE("Deals Page");

	private String displayName;
}
