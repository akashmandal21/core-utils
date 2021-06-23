package com.stanzaliving.food.v2.grammage.request;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.food.v2.common.constant.ThaliType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 04-May-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealThaliTypeRequestDto {

	@NotNull(message = "MealType is mandatory")
	private MealType mealType;

	@NotBlank(message = "Meal group is mandatory")
	private String mealGroupId;

	@NotNull(message = "Thali type is mandatory")
	private ThaliType thaliType;

	private Integer grammage;
}
