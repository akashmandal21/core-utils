package com.stanzaliving.core.food.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuRuleValidationResponse {

	private boolean compositionRulesSatisfied;
	
	private List<WeeklyRuleMealResponseDto> defaultRules;
	
	private List<WeeklyRuleMealResponseDto> weeklyRules;

	private List<DailyDatewiseMealResponseDto> dailyRules;
}