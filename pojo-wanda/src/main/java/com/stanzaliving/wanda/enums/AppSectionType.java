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
public enum AppSectionType {
	
	// HOME_PAGE Section Enums
	
	STORY_WITH_BANNER_HOME_PAGE("Story with Banner", AppPage.HOME_PAGE),
	STORY_HOME_PAGE("Story", AppPage.HOME_PAGE),
	CAROUSEL_HOME_PAGE("Carousel", AppPage.HOME_PAGE),
	COMMERCIALS_DUE_RENTAL_CARD_HOME_PAGE("Commercials Due Rental Card", AppPage.HOME_PAGE),
	VAS_ENTRY_BANNER_HOME_PAGE("VAS Entry Banner", AppPage.HOME_PAGE),
	MEAL_ENTRY_BANNER_HOME_PAGE("Meal Entry Banner", AppPage.HOME_PAGE),
	NEXT_MEAL_CARD_HOME_PAGE("Next Meal Card", AppPage.HOME_PAGE),
	SUPPORT_FEEDBACK_HOME_PAGE("Support Feedback", AppPage.HOME_PAGE),
	FOOD_FEEDBACK_HOME_PAGE("Food Feedback", AppPage.HOME_PAGE),
	EVENT_RSVP_CARD("Event RSVP Card", AppPage.HOME_PAGE),
	ACTIVITY_FEED_HOME_PAGE("Activity Feed", AppPage.HOME_PAGE),

	//FOOD_PAGE Enums
	
	STORY_WITH_BANNER_FOOD_PAGE("Story with Banner", AppPage.FOOD_PAGE),
	STORY_FOOD_PAGE("Story", AppPage.FOOD_PAGE),
	CAROUSEL_FOOD_PAGE("Carousel", AppPage.FOOD_PAGE),
	VAS_ENTRY_BANNER_FOOD_PAGE("VAS Entry Banner", AppPage.FOOD_PAGE),
	MEAL_ENTRY_BANNER_FOOD_PAGE("Meal Entry Banner", AppPage.FOOD_PAGE),
	NEXT_MEAL_CARD_FOOD_PAGE("Next Meal Card", AppPage.FOOD_PAGE),
	FOOD_FEEDBACK_FOOD_PAGE("Food Feedback", AppPage.FOOD_PAGE),
	ACTIVITY_FEED_FOOD_PAGE("Activity Feed", AppPage.FOOD_PAGE),
	
	//MYSTAY_PAGE Enums
	
	
	STORY_WITH_BANNER_MYSTAY_PAGE("Story with Banner", AppPage.MYSTAY_PAGE),
	STORY_MYSTAY_PAGE("Story", AppPage.MYSTAY_PAGE),
	CAROUSEL_MYSTAY_PAGE("Carousel", AppPage.MYSTAY_PAGE),
	COMMERCIALS_DUE_RENTAL_CARD_MYSTAY_PAGE("Commercials Due Rental Card", AppPage.MYSTAY_PAGE),
	PACKAGED_SERVICES_CARD("Packaged Services Card", AppPage.MYSTAY_PAGE),
	VAS_CARDS("VAS Cards", AppPage.MYSTAY_PAGE),
	
	//SUPPORT_HOME_PAGE Enums
	
	STORY_WITH_BANNER_SUPPORT_HOME_PAGE("Story with Banner", AppPage.SUPPORT_HOME_PAGE),
	STORY_SUPPORT_HOME_PAGE("Story", AppPage.SUPPORT_HOME_PAGE),
	CAROUSEL_SUPPORT_HOME_PAGE("Carousel", AppPage.SUPPORT_HOME_PAGE),
	SUPPORT_FEEDBACK_SUPPORT_HOME_PAGE("Support Feedback", AppPage.SUPPORT_HOME_PAGE),
	COMPLAINT_CATEGORY_CARD("Complaint Category Card", AppPage.SUPPORT_HOME_PAGE),
	FAQS_CARD("FAQs Card", AppPage.SUPPORT_HOME_PAGE);

	private String displayName;
	
	private AppPage appPage;
	
	public static List<AppSectionType> HomePageSectionTypeList = new ArrayList<>();
	public static List<AppSectionType> FoodPageSectionTypeList = new ArrayList<>();
	public static List<AppSectionType> MyStayPageSectionTypeList = new ArrayList<>();
	public static List<AppSectionType> SupportHomePageSectionTypeList = new ArrayList<>();
	
	static {

		for (AppSectionType appSection : AppSectionType.values()) {

			switch (appSection.getAppPage()) {
			
			case HOME_PAGE:
				HomePageSectionTypeList.add(appSection);
				break;
			
			case FOOD_PAGE:
				FoodPageSectionTypeList.add(appSection);
				break;
			
			case MYSTAY_PAGE:
				MyStayPageSectionTypeList.add(appSection);
				break;
			
			case SUPPORT_HOME_PAGE:
				SupportHomePageSectionTypeList.add(appSection);
				break;
			
			default:
				break;
			}
		}
	}

	public static List<AppSectionType> getAppSectionTypeListByAppPage(AppPage appPage) {

		switch (appPage) {

		case HOME_PAGE:
			return HomePageSectionTypeList;

		case FOOD_PAGE:
			return FoodPageSectionTypeList;

		case MYSTAY_PAGE:
			return MyStayPageSectionTypeList;

		case SUPPORT_HOME_PAGE:
			return SupportHomePageSectionTypeList;

		default:
			return null;
		}

	}
	
	public static AppSectionType getByAppPageAndDisplayName(AppPage appPage, String displayName) {
		for (AppSectionType appSectionType : AppSectionType.values()) {
			if (appSectionType.getDisplayName().equals(displayName) && appPage.equals(appSectionType.getAppPage())) {
				return appSectionType;
			}
		}
		return null;
	}
}
