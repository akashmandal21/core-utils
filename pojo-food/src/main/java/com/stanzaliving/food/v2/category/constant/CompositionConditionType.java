package com.stanzaliving.food.v2.category.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CompositionConditionType {
	IS_PRESENT("Is Present Condition"),
	COUNT_RULE("Exact Count Condition");
	
	private final String type;
}
