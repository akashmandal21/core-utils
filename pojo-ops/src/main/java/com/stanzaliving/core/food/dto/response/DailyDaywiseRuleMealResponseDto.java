package com.stanzaliving.core.food.dto.response;

import java.util.List;

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
public class DailyDaywiseRuleMealResponseDto extends ConditionDto {

	private Boolean passed;

	private List<DailyDaywiseMealResponseDto> passedMeals;

	private List<DailyDaywiseMealResponseDto> failedMeals;

}