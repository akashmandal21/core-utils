package com.stanzaliving.core.estate.enums;

import java.security.Security;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import static com.stanzaliving.core.estate.constants.EstateSalesReviewSectionFields.*;

@Getter
@AllArgsConstructor
public enum SectionKey {
	OCCUPANCY("Occupancy", "occupancy", TemplateParentKey.PRICING,Boolean.FALSE,Boolean.FALSE,Arrays.asList(PRICE_PER_MONTH,OCCUPANCY_TYPE,REMARKS)),
	ROOM_AMENITIES("Room Amenities", "roomAmenities", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS)),
	COMMON_AMENITIES("Common Amenities", "commonAmenities", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS)),
	SECURITY("Security", "security", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS)),

	LAUNDRY("Laundry", "laundry", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,VAS,PRICE_PER_MONTH,IS_AVAILABLE)),
	HOUSEKEEPING("Housekeeping", "houseKeeping", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,VAS,PRICE_PER_MONTH,IS_AVAILABLE)),
	INTERNET_WIFI("Internet/Wifi", "internet", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(PER_UNIT,SELECTED_OPTIONS,REMARKS,VAS,PRICE_PER_MONTH,IS_AVAILABLE,INPUT_VALUE)),
	SECURITY_DEPOSIT("Security Deposit", "securityDeposit", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(PER_UNIT,SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE)),

	AC("AC", "ac", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(VAS,REMARKS,PRICE_PER_MONTH,IS_AVAILABLE)),
	TRANSPORT("Transport", "transportation", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(REMARKS,VAS,PRICE_PER_MONTH,IS_AVAILABLE)),
	NOTICE_PERIOD("Notice Period", "noticePeriod", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(REMARKS,INPUT_VALUE,IS_AVAILABLE)),
	ELECTRICITY("Electricity", "electricity", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE,Arrays.asList(PER_UNIT,SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE)),
	MEALS_AVAILABLE("Meals Available", "mealsAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(BREAKFAST_DAYS,LUNCH_DAYS,SNACK_DAYS,DINNER_DAYS,IS_AVAILABLE)),
	DESIGN_BEDS("Design & Beds", "designAndBeds", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE,Arrays.asList(PER_UNIT,SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,VAS,PRICE_PER_MONTH)),

	LUNCH("Lunch Box Available", "lunchBoxAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE)),
	WEEKEND_MEAL("Weekend Meal Available", "weekendMealAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE)),
	NON_VEG("Non-Veg Available", "nonVegAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE)),
	DESSERT("Dessert Available", "dessertAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE)),
	EGGS("Eggs Available", "eggsAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE)),
	MILK("Milk Available", "milkAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE)),
	WASHROOM("Washroom", "washroom", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE)),
	OPERATIONAL_PERIOD("Operational Period", "operationalPeriod", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE,Arrays.asList(DURATION,REMARKS,INPUT_VALUE));

	
	private String sectionKeyName;
	private String dbKey;
	private TemplateParentKey parentKey;
	private Boolean mandatory;
	private Boolean available;
	private List<String> sectionParams;

	SectionKey(String sectionKeyName, String dbKey, TemplateParentKey parentKey){
		this.sectionKeyName = sectionKeyName;
		this.dbKey = dbKey;
		this.parentKey = parentKey;
		this.mandatory = Boolean.FALSE;
		this.available = Boolean.FALSE;
		this.sectionParams = null;
	}

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
