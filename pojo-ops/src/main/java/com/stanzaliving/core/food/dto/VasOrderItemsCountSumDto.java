package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Set;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 04-07-2020
 */


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasOrderItemsCountSumDto {
	private String vendorId;

	private Set<String> vasOrderIds;

	private LocalDate menuDate;

	private String residenceId;

	private MealType mealType;

	private FoodItemType itemType;

	private Integer itemCount;

	private Integer orderedQuantity;
}
