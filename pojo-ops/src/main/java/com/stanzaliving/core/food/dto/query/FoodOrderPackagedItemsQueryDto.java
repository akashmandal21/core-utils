package com.stanzaliving.core.food.dto.query;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

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

}
