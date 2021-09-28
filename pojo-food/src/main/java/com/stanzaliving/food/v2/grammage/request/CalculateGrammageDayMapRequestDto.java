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
import java.time.DayOfWeek;
import java.util.Collection;
import java.util.Map;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 22-Jul-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CalculateGrammageDayMapRequestDto {
	@NotBlank(message = "MenuCategoryVersionId is required")
	private String menuCategoryVersionId;

	@NotNull(message = "Food Serve type is mandatory")
	private FoodServeType foodServeType;

	@NotEmpty(message = "meal wise items map is required")
	private Map<String, Map<DayOfWeek, Map<String, Collection<String>>>> mealThaliItemMap;
}
