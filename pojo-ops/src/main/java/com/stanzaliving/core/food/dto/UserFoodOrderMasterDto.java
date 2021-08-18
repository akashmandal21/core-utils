package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodOrderType;
import com.stanzaliving.core.food.enums.PackageCollectionStatus;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class UserFoodOrderMasterDto extends AbstractDto {
	private String masterOrderId;
	private FoodOrderType orderType;
	private MealType mealType;
	private String userId;
	private String userUUID;
	private LocalDate menuDate;
	private LocalTime mealStartTime;
	private LocalTime mealEndTime;
	private PackageCollectionStatus collectionStatus;
	private String foodOrderId;
	private FoodItemType foodPreference;
}
