package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RequestReplacementReason {

	FOREIGN_PARTICLES_FOUND("Foreign particles found"), 
	MEAL_CONTENTS_MESSED_UP("Meal contents were messed up"), 
	SOMETHING_ELSE("Something else");

	private String reason; 

}
