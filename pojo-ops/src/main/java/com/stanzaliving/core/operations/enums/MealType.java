/**
 * 
 */
package com.stanzaliving.core.operations.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

	BREAKFAST(1, "Breakfast", 10, "https://res.cloudinary.com/stanza-living/image/upload/v1604332446/food/meals/Indian_Combo.png", "B"),
	LUNCH(2, "Lunch", 20, "https://res.cloudinary.com/stanza-living/image/upload/v1604331333/food/meals/Roti_Thali.png", "L"),
	EVENING_SNACKS(3, "Evening Snacks", 50, "https://res.cloudinary.com/stanza-living/image/upload/v1604332760/food/meals/Evening_Snacks.png", "S"),
	DINNER(4, "Dinner", 60, "https://res.cloudinary.com/stanza-living/image/upload/v1604331333/food/meals/Roti_Thali.png", "D"),
	BRUNCH(5, "Brunch", 20, "https://res.cloudinary.com/stanza-living/image/upload/v1604331332/food/meals/Breakfast_Veg.png", "Br"),
	LUNCH_TIFFIN(6, "Lunch Tiffin", 40, "https://res.cloudinary.com/stanza-living/image/upload/v1604331333/food/meals/Roti_Thali.png", "T");

	private Integer mealId;

	private String mealName;

	private Integer sequence;

	private String imageUrl;
	private String initial;

	private static Map<Integer, MealType> mealMapById = new HashMap<>();
	private static Map<String, MealType> mealMapByName = new HashMap<>();
	private static List<String> mealIds = new ArrayList<>();
	private static Map<MealType, String> mealMapByType = new LinkedHashMap<>();
	private static Map<String, String> mealMapByTypeStr = new LinkedHashMap<>();
	private static Map<String, MealType> mealMapByTypeString = new LinkedHashMap<>();
	private static Map<String, String> mealMapNameByTypeString = new LinkedHashMap<>();

	private static List<EnumListing<MealType>> enumListings = new ArrayList<>();
	private static Set<MealType> firstHalfMealsSet = new HashSet<>();
	private static Set<MealType> secondHalfMealsSet = new HashSet<>();
	private static Set<MealType> majorMeals = new HashSet<>();

	static {

		for (MealType mealType : MealType.values()) {
			mealMapById.put(mealType.getMealId(), mealType);
			mealMapByName.put(mealType.getMealName(), mealType);
			mealIds.add(mealType.getMealId().toString());
			enumListings.add(EnumListing.of(mealType, mealType.getMealName()));
			mealMapByTypeString.put(mealType.toString(), mealType);
			mealMapNameByTypeString.put(mealType.toString(), mealType.getMealName());
			mealMapByType.put(mealType, mealType.getMealName());
			mealMapByTypeStr.put(mealType.toString(), mealType.getMealName());	
		}

		firstHalfMealsSet.add(BREAKFAST);
		firstHalfMealsSet.add(BRUNCH);
		firstHalfMealsSet.add(LUNCH);
		firstHalfMealsSet.add(LUNCH_TIFFIN);

		secondHalfMealsSet.add(EVENING_SNACKS);
		secondHalfMealsSet.add(DINNER);

		majorMeals.addAll(Arrays.asList(MealType.values()));
		majorMeals.remove(LUNCH_TIFFIN);
		majorMeals.remove(BRUNCH);

	}

	public static Integer getMealId(String mealName) {

		if (mealMapByName.containsKey(mealName)) {
			return mealMapByName.get(mealName).getMealId();
		}

		return -1;

	}

	public static Set<MealType> getMajorMeals() {
		return majorMeals;
	}

	public static Map<MealType, String> getMealMapByType() {
		return mealMapByType;
	}

	public static Map<String, String> getMealMapByTypeStr() {
		return mealMapByTypeStr;
	}
	
	public static String getMealMapNameByTypeStr(String mealType) {
		return mealMapNameByTypeString.get(mealType);
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
	
	public static MealType getMealByTypeString(String mealName) {
		return mealMapByTypeString.get(mealName);
	}

	public static List<EnumListing<MealType>> getMealListing() {
		return enumListings;
	}

	public static Set<MealType> getFirstHalfMeals() {
		return firstHalfMealsSet;
	}

	public static Set<MealType> getSecondHalfMeals() {
		return secondHalfMealsSet;
	}

	public static boolean isFirstHalfMeal(MealType mealType) {
		return firstHalfMealsSet.contains(mealType);
	}

	public static boolean isSecondHalfMeal(MealType mealType) {
		return secondHalfMealsSet.contains(mealType);
	}

	public static boolean isMealApplicableForKitchenOrder(MealType mealType) {
		return BREAKFAST == mealType || LUNCH == mealType || EVENING_SNACKS == mealType || DINNER == mealType;
	}
}