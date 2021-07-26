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
import java.util.Map;
import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 26-Jul-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CalculateGrammageThaliRequestDto {
	@NotBlank(message = "Version Id is required")
	private String menuCategoryVersionId;

//	@NotNull(message = "Food Serve Type is required")
	private FoodServeType foodServeType;

	@NotEmpty(message = "Items are required")
	private Map<String, Map<DayOfWeek, Map<String, ThaliGrammageCalculatorRequestDto>>> itemsMap;
}
