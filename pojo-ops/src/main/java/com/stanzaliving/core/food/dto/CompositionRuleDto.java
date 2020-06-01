package com.stanzaliving.core.food.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.rule.engine.dto.ConditionCombinationDto;

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
@AllArgsConstructor
@NoArgsConstructor
public class CompositionRuleDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "Weekly rule is required")
	private ConditionCombinationDto weeklyRule;

	@NotNull(message = "Daily rule is required")
	private ConditionCombinationDto dailyRule;
}