package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Map;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 30-June-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderComboItemsDto {
	private String vendorId;

	private LocalDate menuDate;

	private MealType mealType;

	private String residenceId;

	private FoodItemBasePreference basePreference;

	private String itemId;

	private String itemName;

	private FoodItemType itemType;

	private boolean quantifiable;

	private Integer orderedQuantity;

	private Double orderedWeight;

	private FoodRegion foodRegion;
}
