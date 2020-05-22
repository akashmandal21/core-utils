package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.dto.CompositionRuleDto;
import com.stanzaliving.core.food.dto.DayWiseFoodMenuDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 18-May-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DayWiseFoodCategoryMenuRulesDto {
	@NotNull(message = "composition Rules can't be blank")
	private CompositionRuleDto rules;

	@NotNull(message = "meal is required.")
	List<DayWiseFoodMenuDto> dayWiseFoodMenuDtos;
}
