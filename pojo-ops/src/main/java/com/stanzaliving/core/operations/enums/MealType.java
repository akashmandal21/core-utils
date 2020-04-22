/**
 * 
 */
package com.stanzaliving.core.operations.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

	static {

		for (MealType mealType : MealType.values()) {
			mealMapById.put(mealType.getMealId(), mealType);
			mealMapByName.put(mealType.getMealName(), mealType);
			mealIds.add(mealType.getMealId().toString());

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

	public static List<String> getMealIds() {
		return mealIds;
	}
}