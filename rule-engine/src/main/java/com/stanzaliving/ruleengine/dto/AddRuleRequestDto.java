package com.stanzaliving.ruleengine.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AddRuleRequestDto {
	@NotNull(message = "weekly rule is required.")
	private ConditionCombinationDto weeklyRule;

	@NotNull(message = "dailyRule is required.")
	private ConditionCombinationDto dailyRule;
}
