package com.stanzaliving.core.estate.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SectionKey {
	
	OCCUPANCY("Occupancy", "occupancy", TemplateParentKey.PRICING),
	ROOM_AMENITIES("Room Amenities", "roomAmenities", TemplateParentKey.OTHERS),
	COMMON_AMENITIES("Common Amenities", "commonAmenities", TemplateParentKey.OTHERS),
	LAUNDRY("Laundry", "laundry", TemplateParentKey.OTHERS),
	HOUSEKEEPING("Housekeeping", "houseKeeping", TemplateParentKey.OTHERS),
	INTERNET_WIFI("Internet/Wifi", "internet", TemplateParentKey.OTHERS),
	SECURITY_DEPOSIT("Security Deposit", "securityDeposit", TemplateParentKey.OTHERS),
	AC("AC", "ac", TemplateParentKey.OTHERS),
	ELECTRICITY("Electricity", "electricity", TemplateParentKey.OTHERS),
	MEALS_AVAILABLE("Meals Available", "mealsAvailable", TemplateParentKey.OTHERS),
	LUNCH("Lunch Box Available", "lunchBoxAvailable", TemplateParentKey.OTHERS),
	WEEKEND_MEAL("Weekend Meal Available", "weekendMealAvailable", TemplateParentKey.OTHERS),
	NON_VEG("Non-Veg Available", "nonVegAvailable", TemplateParentKey.OTHERS),
	DESSERT("Dessert Available", "dessertAvailable", TemplateParentKey.OTHERS),
	EGGS("Eggs Available", "eggsAvailable", TemplateParentKey.OTHERS),
	MILK("Milk Available", "milkAvailable", TemplateParentKey.OTHERS),
	NOTICE_PERIOD("Notice Period", "noticePeriod", TemplateParentKey.OTHERS),
	SECURITY("Security", "security", TemplateParentKey.OTHERS),
	TRANSPORT("Transport", "transportation", TemplateParentKey.OTHERS),
	DESIGN_BEDS("Design & Beds", "designAndBeds", TemplateParentKey.OTHERS),
	OPERATIONAL_PERIOD("Operational Period", "operationalPeriod", TemplateParentKey.OTHERS);

	
	private String sectionKeyName;
	private String dbKey;
	private TemplateParentKey parentKey;
	
	private static Map<String, SectionKey> sectionDBKeyMap = new HashMap<>();
	private static Map<SectionKey, String> mandatorySectionMap = new HashMap<>();
	
	
	static {
		
		for(SectionKey key : SectionKey.values()) {
			
			sectionDBKeyMap.put(key.getDbKey(), key);
			if(EnumSet.of(ROOM_AMENITIES, COMMON_AMENITIES,DESIGN_BEDS,OPERATIONAL_PERIOD,
					ELECTRICITY,SECURITY).contains(key)) {
				mandatorySectionMap.put(key, key.getSectionKeyName());
			}
		}
		
	}
	
	public static SectionKey getSectionFromDbKey(String key) {
		
		return sectionDBKeyMap.get(key);
	}
	
	public static Boolean isMandatorySectionKey(SectionKey key) {
		
		return mandatorySectionMap.containsKey(key);
	}

}
