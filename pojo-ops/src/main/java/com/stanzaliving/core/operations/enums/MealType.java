/**
 * 
 */
package com.stanzaliving.core.operations.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.base.utils.StanzaParseUtils;
import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 20-Jan-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum MealType {

	BREAKFAST(1, "Breakfast", 1),
	LUNCH(2, "Lunch", 2),
	EVENING_SNACKS(3, "Evening Snacks", 5),
	DINNER(4, "Dinner", 6),
	BRUNCH(5, "Brunch", 2),
	LUNCH_TIFFIN(6, "Lunch Tiffin", 4);

	private Integer mealId;

	private String mealName;

	private Integer sequence;

	private static Map<Integer, MealType> mealMapById = new HashMap<>();
	private static Map<String, MealType> mealMapByName = new HashMap<>();
	private static List<String> mealIds = new ArrayList<>();
	private static Map<MealType, String> mealMapByType = new LinkedHashMap<>();
	private static Map<String, String> mealMapByTypeStr = new LinkedHashMap<>();

	private static List<EnumListing<MealType>> enumListings = new ArrayList<>();

	static {

		for (MealType mealType : MealType.values()) {
			mealMapById.put(mealType.getMealId(), mealType);
			mealMapByName.put(mealType.getMealName(), mealType);
			mealIds.add(mealType.getMealId().toString());
			enumListings.add(EnumListing.of(mealType, mealType.getMealName()));
		}
		mealMapByType.put(BREAKFAST, BREAKFAST.getMealName());
		mealMapByType.put(LUNCH, LUNCH.getMealName());
		mealMapByType.put(EVENING_SNACKS, EVENING_SNACKS.getMealName());
		mealMapByType.put(DINNER, DINNER.getMealName());

		mealMapByTypeStr.put(BREAKFAST.toString(), BREAKFAST.getMealName());
		mealMapByTypeStr.put(LUNCH.toString(), LUNCH.getMealName());
		mealMapByTypeStr.put(EVENING_SNACKS.toString(), EVENING_SNACKS.getMealName());
		mealMapByTypeStr.put(DINNER.toString(), DINNER.getMealName());

	}

	public static Integer getMealId(String mealName) {

		if (mealMapByName.containsKey(mealName)) {
			return mealMapByName.get(mealName).getMealId();
		}

		return -1;

	}

	public static Map<MealType, String> getMealMapByType() {
		return mealMapByType;
	}

	public static Map<String, String> getMealMapByTypeStr() {
		return mealMapByTypeStr;
	}
	
	public static String getMealName(String mealId) {

		if (mealMapById.containsKey(StanzaParseUtils.getIntValue(mealId))) {
			return mealMapById.get(StanzaParseUtils.getIntValue(mealId)).getMealName();
		}

		return null;
	}

	public static MealType getMeal(Integer mealId) {
		return mealMapById.get(mealId);
	}

	public static List<String> getMealIds() {
		return mealIds;
	}

	public static MealType getMealByName(String mealName) {
		return mealMapByName.get(mealName);
	}

	public static List<EnumListing<MealType>> getMealListing() {
		return enumListings;
	}
}