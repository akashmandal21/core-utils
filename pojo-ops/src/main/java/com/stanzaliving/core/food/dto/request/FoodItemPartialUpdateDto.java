package com.stanzaliving.core.food.dto.request;


import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

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
public class FoodItemPartialUpdateDto {
	@NotNull(message = "item uuid is required.")
	private String uuid;

	private Set<MealType> meals;

	private String textColor;

	private String bgColor;

	private Boolean quantifiable;

	private FoodItemType foodItemType;

	private Set<String> tagIds;
}
