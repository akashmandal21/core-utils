package com.stanzaliving.core.food.dto.response;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Collection;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DaywiseFoodMenuRuleValidationResponse {

	private boolean compositionRulesSatisfied;

	private Collection<DaywiseWeeklyRuleMealResponseDto> weeklyRules;

	private Collection<DailyDaywiseRuleMealResponseDto> dailyRules;
}

