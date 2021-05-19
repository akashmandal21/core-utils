package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodOrderType;
import com.stanzaliving.core.food.enums.PackageCollectionStatus;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 10-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserFoodOrderMasterUpdateDto {

	private FoodOrderType orderType;

	private MealType mealType;

	private String userId;

	private LocalDate menuDate;

	private PackageCollectionStatus orderStatus;

	private String foodOrderId;

	private FoodItemType foodPreference;

	private LocalTime mealStartTime;

	private LocalTime mealEndTime;
}
