package com.stanzaliving.food.v2.grammage.request;

import com.stanzaliving.core.food.enums.FoodServeType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 24-Jul-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CalculateGrammageOptionRequestDto {

	@NotBlank(message = "Version Id is required")
	private String menuCategoryVersionId;

	@NotNull(message = "Food Serve Type is required")
	private FoodServeType foodServeType;

	@NotBlank(message = "Thali Id is required")
	private String thaliId;

	@NotBlank(message = "Meal Id is required")
	private String mealId;

	@NotEmpty(message = "Items are required")
	private Set<String> itemIds;
}
