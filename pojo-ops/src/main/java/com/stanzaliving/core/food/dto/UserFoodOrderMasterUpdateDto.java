package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodOrderType;
import com.stanzaliving.core.food.enums.PackageCollectionStatus;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
import java.time.LocalTime;

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
