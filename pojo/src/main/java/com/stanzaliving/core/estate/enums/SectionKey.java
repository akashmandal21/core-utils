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
	ROOM_AMENITIES("Room Amenities", "roomAmenities", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS,IMAGE)),
	COMMON_AMENITIES("Common Amenities", "commonAmenities", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS,IMAGE)),
	SECURITY("Security", "security", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS,IMAGE)),

	LAUNDRY("Laundry", "laundry", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,VAS,PRICE_PER_MONTH,IS_AVAILABLE,IMAGE)),
	HOUSEKEEPING("Housekeeping", "houseKeeping", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,VAS,PRICE_PER_MONTH,IS_AVAILABLE,IMAGE)),
	INTERNET_WIFI("Internet/Wifi", "internet", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(PER_UNIT,SELECTED_OPTIONS,REMARKS,VAS,PRICE_PER_MONTH,IS_AVAILABLE,INPUT_VALUE,IMAGE)),
	SECURITY_DEPOSIT("Security Deposit", "securityDeposit", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(PER_UNIT,SELECTED_OPTIONS, AMOUNT_TYPE, REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),

	AC("AC", "ac", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(VAS,REMARKS,PRICE_PER_MONTH,IS_AVAILABLE,IMAGE)),
	TRANSPORT("Transport", "transportation", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(REMARKS,VAS,PRICE_PER_MONTH,IS_AVAILABLE,IMAGE)),
	NOTICE_PERIOD("Notice Period", "noticePeriod", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	ELECTRICITY("Electricity", "electricity", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE,Arrays.asList(PER_UNIT,SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	MEALS_AVAILABLE("Meals", "mealsAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(BREAKFAST_DAYS,LUNCH_DAYS,SNACK_DAYS,DINNER_DAYS,IS_AVAILABLE,IMAGE)),
	DESIGN_BEDS("Design & Beds", "designAndBeds", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE,Arrays.asList(PER_UNIT,SELECTED_OPTIONS,REMARKS,INPUT_VALUE,VAS,PRICE_PER_MONTH,IMAGE)),

	LUNCH("Lunch Box", "lunchBoxAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	WEEKEND_MEAL("Weekend Meal", "weekendMealAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	NON_VEG("Non-Veg", "nonVegAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	DESSERT("Dessert", "dessertAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	EGGS("Eggs", "eggsAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	MILK("Milk", "milkAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	WASHROOM("Washroom", "washroom", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	OPERATIONAL_PERIOD("Operational Period", "operationalPeriod", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE,Arrays.asList(DURATION,REMARKS,INPUT_VALUE,IMAGE));

	
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
