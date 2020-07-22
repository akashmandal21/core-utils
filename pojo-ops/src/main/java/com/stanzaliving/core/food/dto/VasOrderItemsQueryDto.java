package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 04-July-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasOrderItemsQueryDto {

	private String vendorId;

	private String residenceId;

	private MealType mealType;

	private FoodItemType itemType;

	private String itemId;

	private String itemName;

	private boolean quantifiable;

	private Integer orderQuantity;

	private Integer grammageQuantity;

	private Integer unitGrammageWeight;
}
