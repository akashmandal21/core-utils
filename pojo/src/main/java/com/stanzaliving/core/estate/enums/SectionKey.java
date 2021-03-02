package com.stanzaliving.core.estate.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SectionKey {
	
	OCCUPANCY("Occupancy", TemplateParentKey.PRICING),
	ROOM_AMENITIES("Room Amenities", TemplateParentKey.OTHERS),
	COMMON_AMENITIES("Common Amenities", TemplateParentKey.OTHERS),
	LAUNDRY("LAUNDRY", TemplateParentKey.OTHERS),
	HOUSEKEEPING("Housekeeping", TemplateParentKey.OTHERS),
	INTERNET_WIFI("Internet/Wifi", TemplateParentKey.OTHERS),
	SECURITY_DEPOSIT("Security Deposit", TemplateParentKey.OTHERS),
	AC("AC", TemplateParentKey.OTHERS),
	ELECTRICITY("Electricity", TemplateParentKey.OTHERS),
	MEALS_AVAILABLE("Meals Available", TemplateParentKey.OTHERS),
	LUNCH("Lunch Box Available", TemplateParentKey.OTHERS),
	WEEKEND_MEAL("Weekend Meal Available", TemplateParentKey.OTHERS),
	NON_VEG("Non-Veg Available", TemplateParentKey.OTHERS),
	DESSERT("Dessert Available", TemplateParentKey.OTHERS),
	EGGS("Eggs Available", TemplateParentKey.OTHERS),
	MILK("Milk Available", TemplateParentKey.OTHERS),
	NOTICE_PERIOD("Notice Period", TemplateParentKey.OTHERS),
	SECURITY("Security", TemplateParentKey.OTHERS),
	TRANSPORT("Transport", TemplateParentKey.OTHERS),
	DESIGN_BEDS("Design & Beds", TemplateParentKey.OTHERS),
	OPERATIONAL_PERIOD("Operational Period", TemplateParentKey.OTHERS);

	
	private String sectionKeyName;
	private TemplateParentKey parentKey;

}
