package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.dto.CompositionRuleDto;
import com.stanzaliving.core.food.dto.TotalMealPriceDto;

import lombok.*;
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

	private boolean publishable;

	private boolean draftAvailable;

	private boolean pendingApproval;

	@NotNull(message = "Category Metadata is Mandatory")
	private @Valid FoodMenuCategoryMetadataDto category;

	private CompositionRuleDto rules;

	@NotEmpty(message = "Meal Mappings are mandatory")
	private List<FoodMenuCategoryMealDto> meals;

	private List<WeekWiseMenu> weekMenus;

	private TotalMealPriceDto fnbMealPriceDto;

}