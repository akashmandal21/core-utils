package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.dto.CompositionRuleDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 09-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FullCategoryDto {

	private FoodMenuCategoryAddRequestDto category;

	@NotNull(message = "Composition Rules are mandatory")
	private CompositionRuleDto rules;

	private List<FoodMenuCategoryMealDto> meals;

	private List<WeekWiseMenu> weekMenus;
}