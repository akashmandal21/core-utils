package com.stanzaliving.core.food.dto.response;

import java.util.Set;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.rule.engine.dto.ConditionDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DailyRuleMealResponseDto extends ConditionDto {

	private Boolean passed;

	private Set<MealType> meals;
}