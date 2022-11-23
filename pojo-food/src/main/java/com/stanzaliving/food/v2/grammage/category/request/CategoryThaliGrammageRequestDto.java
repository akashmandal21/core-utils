package com.stanzaliving.food.v2.grammage.category.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 15-Jun-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryThaliGrammageRequestDto {

	@NotBlank(message = "Thali selection is mandatory")
	private String thaliMasterId;

	private boolean status;

	@Valid
	@NotEmpty(message = "Meal wise grammage selection is mandatory")
	private List<CategoryMealGrammageRequestDto> mealGrammages;
}
