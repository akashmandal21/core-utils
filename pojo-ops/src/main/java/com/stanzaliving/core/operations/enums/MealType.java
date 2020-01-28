/**
 * 
 */
package com.stanzaliving.core.operations.enums;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.core.base.utils.StanzaParseUtils;

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

	BREAKFAST(1, "Breakfast"),
	LUNCH(2, "Lunch"),
	EVENING_SNACKS(3, "Evening Snacks"),
	DINNER(4, "Dinner"),
	BRUNCH(5, "Brunch"),
	LUNCH_TIFFIN(6, "Lunch Tiffin");

	private Integer mealId;

	private String mealName;

	private static Map<Integer, MealType> mealMapById = new HashMap<>();
	private static Map<String, MealType> mealMapByName = new HashMap<>();

	static {

		for (MealType mealType : MealType.values()) {
			mealMapById.put(mealType.getMealId(), mealType);
			mealMapByName.put(mealType.getMealName(), mealType);

		}

	}

	public static Integer getMealId(String mealName) {

		if (mealMapByName.containsKey(mealName)) {
			return mealMapByName.get(mealName).getMealId();
		}

		return -1;

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
}