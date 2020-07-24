package com.stanzaliving.core.food.dto.request;

import java.util.Set;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliing.com"
 *
 * @date 04-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemUpdateDto {

	@NotNull(message = "item uuid is required.")
	private String uuid;

	private Set<MealType> meals;

	private String textColor;

	private String bgColor;

	private Boolean quantifiable;

	private FoodItemType foodItemType;

	private Set<String> tagIds;
	
	private String subCategory;
	
	private boolean vasEnabled;
}