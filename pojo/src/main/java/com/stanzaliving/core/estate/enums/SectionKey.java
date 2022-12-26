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
	WEEKEND_MEAL("Weekend Meal", "weekendMealAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	NON_VEG("Non-Veg", "nonVegAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	MILK("Milk", "milkAvailable", TemplateParentKey.OTHERS,Boolean.FALSE,Boolean.FALSE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	WASHROOM("Washroom", "washroom", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	OPERATIONAL_PERIOD("Operational Period", "operationalPeriod", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.FALSE,Arrays.asList(DURATION,REMARKS,INPUT_VALUE,IMAGE)),
	GENDER("Gender","propertyBasicDetailsGender", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),

	BREAKFAST("Breakfast","breakfast", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE)),
	LUNCH("Lunch", "lunch", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.TRUE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	SNACKS("Snacks","snacks", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE)),
	DINNER("Dinner","dinner", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE)),
	BEVERAGES("Beverages (tea + coffee + milk)","beverages", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE)),
	DESSERT("Dessert", "dessertAvailable", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.TRUE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	EGGS("Eggs", "eggsAvailable", TemplateParentKey.OTHERS,Boolean.TRUE,Boolean.TRUE,Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	CHICKEN("Chicken","chicken", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	PANEER("Paneer","paneer", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	FRUITS("Fruits","fruits", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	BREAD_BUTTER_AND_JAM("Bread, Butter & Jam","breadButterAndJam", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	KITCHEN_NAME("Kitchen Name","kitchenName", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	KITCHEN_MENU_CONFIG("Kitchen Menu Config","kitchenMenuConfig", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),

	ROOMS_WITH_AC_REQUIREMENT("Rooms with AC requirement","roomsWithAcRequirement", TemplateParentKey.OTHERS, Boolean.FALSE, Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	ROOMS_WITH_TV_REQUIREMENT("Rooms with TV requirement","roomsWithTvRequirement", TemplateParentKey.OTHERS, Boolean.FALSE, Boolean.FALSE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IS_AVAILABLE,IMAGE)),
	POOL_TABLE_REQUIRED("Pool Table required","isPoolTableRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	TABLE_TENNIS_REQUIRED("Table Tennis required","isTableTennisRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	FOOS_BALL_REQUIRED("Foos Ball required","isFoosBallRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	SOFA_REQUIRED("Sofa required","isSofaRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	CENTER_TABLE_REQUIRED("Center Table required","isCenterTableRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	BEAN_BAG_REQUIRED("Bean Bag required","isBeanBagRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	DINING_SET_REQUIRED("Dining Set required","isDiningSetRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	TV_REQUIRED("TV required","isTvRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	FRIDGE_REQUIRED("Fridge required","isFridgeRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE)),
	RO_REQUIRED("RO required","isRoRequired", TemplateParentKey.OTHERS, Boolean.TRUE, Boolean.TRUE, Arrays.asList(SELECTED_OPTIONS,REMARKS,INPUT_VALUE,IMAGE));

	
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
