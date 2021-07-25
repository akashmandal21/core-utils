package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.rule.engine.dto.ConditionDto;
import com.stanzaliving.food.v2.category.constant.CompositionConditionType;
import com.stanzaliving.food.v2.category.constant.RuleDuration;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class CompositionConditionV2Dto extends ConditionDto {
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "Rule Condition is Empty")
	private RuleDuration condition;
	
	private CompositionConditionType type;
	
	@Builder.Default
	private Boolean passed = true;
	
	private Map<MealType, List<DayOfWeek>> failedMeals;
	private Map<MealType, Map<DayOfWeek, List<String>>> missingTagMeals;
	
}
