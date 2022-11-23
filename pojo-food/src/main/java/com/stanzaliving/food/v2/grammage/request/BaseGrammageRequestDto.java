package com.stanzaliving.food.v2.grammage.request;

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
 * @since 13-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseGrammageRequestDto {

	@NotBlank(message = "SubCategory selection is mandatory")
	private String subCategoryId;

	@Valid
	@NotEmpty(message = "Meal grammages are mandatory")
	private List<MealThaliTypeRequestDto> mealGrammages;

	private Boolean additive;

	private Boolean override;

}
