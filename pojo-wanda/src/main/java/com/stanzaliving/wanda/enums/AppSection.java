package com.stanzaliving.wanda.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.banner.enumeration.AppPage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum AppSection {
	
	// HOME_PAGE Section Enums

	DEALS_HOME_PAGE("Deals", AppPage.HOME_PAGE), 
	FOOD("Food", AppPage.HOME_PAGE), 
	FEEDBACK("Feedback", AppPage.HOME_PAGE), 
	COMMERCIALS("Commercials", AppPage.HOME_PAGE), 
	REFERRAL("Referral", AppPage.HOME_PAGE), 
	COMMUNITY("Community", AppPage.HOME_PAGE), 
	FEED_HOME_PAGE("Feed", AppPage.HOME_PAGE),
	
	//FOOD_PAGE Enums
	
	FOOD_MEAL_PREFERENCES("Food Meal Preferences", AppPage.FOOD_PAGE),
	DEALS_FOOD_PAGE("Deals", AppPage.FOOD_PAGE),
	FEED_FOOD_PAGE("Feed", AppPage.FOOD_PAGE),
	
	//MYSTAY_PAGE Enums
	
	STAY_INFORMATION("STAY_INFORMATION", AppPage.MYSTAY_PAGE),
	COMMERCIALS_MYSTAY_PAGE("Commercials Mystay Page", AppPage.MYSTAY_PAGE),
	SERVICES("Services", AppPage.MYSTAY_PAGE),
	DEALS_MYSTAY_PAGE("Deals", AppPage.MYSTAY_PAGE),
	
	//SUPPORT_HOME_PAGE Enums
	
	RECENT_TICKETS("Recent Tickets", AppPage.SUPPORT_HOME_PAGE),
	CATEGORIES("Categories", AppPage.SUPPORT_HOME_PAGE),
	FAQS("Faqs", AppPage.SUPPORT_HOME_PAGE),
	FEEDBACK_SUPPORT_PAGE("Feedback", AppPage.SUPPORT_HOME_PAGE), 
	DEALS_SUPPORT_PAGE("Deals", AppPage.SUPPORT_HOME_PAGE);

	private String displayName;
	
	private AppPage appPage;
	
	public static List<AppSection> HomePageSectionList = new ArrayList<>();
	public static List<AppSection> FoodPageSectionList = new ArrayList<>();
	public static List<AppSection> MyStayPageSectionList = new ArrayList<>();
	public static List<AppSection> SupportHomePageSectionList = new ArrayList<>();
	
	static {

		for (AppSection appSection : AppSection.values()) {

			switch (appSection.getAppPage()) {
			
			case HOME_PAGE:
				HomePageSectionList.add(appSection);
				break;
			
			case FOOD_PAGE:
				FoodPageSectionList.add(appSection);
				break;
			
			case MYSTAY_PAGE:
				MyStayPageSectionList.add(appSection);
				break;
			
			case SUPPORT_HOME_PAGE:
				SupportHomePageSectionList.add(appSection);
				break;
			
			default:
				break;
			}
		}
	}

	public static List<AppSection> getAppSectionListByAppPage(AppPage appPage) {

		switch (appPage) {

		case HOME_PAGE:
			return HomePageSectionList;

		case FOOD_PAGE:
			return FoodPageSectionList;

		case MYSTAY_PAGE:
			return MyStayPageSectionList;

		case SUPPORT_HOME_PAGE:
			return SupportHomePageSectionList;

		default:
			return null;
		}

	}
	
	public static AppSection getByAppPageAndDisplayName(AppPage appPage, String displayName) {
		for (AppSection appSection : AppSection.values()) {
			if (appSection.getDisplayName().equals(displayName) && appPage.equals(appSection.getAppPage())) {
				return appSection;
			}
		}
		return null;
	}
}
