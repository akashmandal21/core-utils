package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 05-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemTypeWiseMealCount {

	private String dispatchItemUuid;
	private String itemTypeName;

	private Integer numberOfMeals;
	private Integer numberOfMealsReceived;
}