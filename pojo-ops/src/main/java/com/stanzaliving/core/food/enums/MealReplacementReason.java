package com.stanzaliving.core.food.enums;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MealReplacementReason {

	WRONG_ITEM_IN_THE_PACKET("Wrong item in the packet"),
	FOREIGN_PARTICLES_FOUND("Foreign particle found"), 
	MEAL_CONTENTS_MESSED_UP("Content messed up"), 
	FOREIGN_PARTICLE("Foreign particle"),
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
		
		nonVasItemReasonMap.put(FOREIGN_PARTICLE,  FOREIGN_PARTICLE.getReason());
		nonVasItemReasonMap.put(MEAL_CONTENTS_MESSED_UP, MEAL_CONTENTS_MESSED_UP.getReason());
		nonVasItemReasonMap.put(SOMETHING_ELSE, SOMETHING_ELSE.getReason());

		return nonVasItemReasonMap;
	}
}
