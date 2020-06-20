package com.stanzaliving.core.food.enums;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MealReplacementReason {

	WRONG_ITEM_IN_THE_PACKET("Wrong item in the packet"),
	FOREIGN_PARTICLES_FOUND("Foreign particles found"), 
	MEAL_CONTENTS_MESSED_UP("Meal contents were messed up"), 
	SOMETHING_ELSE("Something else");

	private String reason; 

	
	public static Map<MealReplacementReason, String> vasItemReason() {
		Map<MealReplacementReason, String> vasItemReasonMap = new LinkedHashMap<>();
		
		vasItemReasonMap.put(WRONG_ITEM_IN_THE_PACKET, WRONG_ITEM_IN_THE_PACKET.getReason());
		vasItemReasonMap.put(FOREIGN_PARTICLES_FOUND,  FOREIGN_PARTICLES_FOUND.getReason());
		vasItemReasonMap.put(SOMETHING_ELSE, SOMETHING_ELSE.getReason());

		return vasItemReasonMap;
	}
	
	public static Map<MealReplacementReason, String> nonVasItemReason() {
		Map<MealReplacementReason, String> nonVasItemReasonMap = new LinkedHashMap<>();
		
		nonVasItemReasonMap.put(FOREIGN_PARTICLES_FOUND,  FOREIGN_PARTICLES_FOUND.getReason());
		nonVasItemReasonMap.put(MEAL_CONTENTS_MESSED_UP, MEAL_CONTENTS_MESSED_UP.getReason());
		nonVasItemReasonMap.put(SOMETHING_ELSE, SOMETHING_ELSE.getReason());

		return nonVasItemReasonMap;
	}
}
