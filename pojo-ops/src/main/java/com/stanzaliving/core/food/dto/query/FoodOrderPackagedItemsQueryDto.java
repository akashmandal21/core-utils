package com.stanzaliving.core.food.dto.query;

import java.time.LocalDate;

import com.stanzaliving.core.enums.UnitOfMeasurement;
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
 * @date 11-July-2020
 */


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderPackagedItemsQueryDto {
	private LocalDate menuDate;

	private String vendorId;

	private String residenceId;

	private String orderId;

	private String residenceMenuId;

	private MealType mealType;

	private String itemId;

	private FoodItemType itemType;

	private String itemName;

	private boolean quantifiable;

	private Integer itemQuantity;

	private Integer itemWeight;

	private boolean defaultMenu;

	private String comments;

	private UnitOfMeasurement unitOfMeasurement;

}
