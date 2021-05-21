package com.stanzaliving.food.v2.grammage.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 20-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealGrammageRequestDto extends GrammageStatusRequestDto {

	@NotBlank(message = "Meal selection is mandatory")
	private String mealMasterId;

}
