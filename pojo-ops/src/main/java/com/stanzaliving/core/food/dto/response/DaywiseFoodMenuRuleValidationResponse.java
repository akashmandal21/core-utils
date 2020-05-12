package com.stanzaliving.core.food.dto.response;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DaywiseFoodMenuRuleValidationResponse {

	private boolean compositionRulesSatisfied;

	private List<DaywiseWeeklyRuleMealResponseDto> weeklyRules;

	private List<DailyDaywiseMealResponseDto> dailyRules;
}

