package com.stanzaliving.core.food.dto.response;


import com.stanzaliving.core.food.dto.PriceDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodOrderType;
import com.stanzaliving.core.food.enums.PackageCollectionStatus;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 11-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderMasterResponseDto {
	private String masterOrderId;

	private FoodOrderType orderType;

	private String orderTypeName;

	private MealType mealType;

	private String mealTypeName;

	private String userId;

	private LocalDate menuDate;

	private PackageCollectionStatus collectionStatus;

	private String collectionStatusName;

	private String foodOrderId;

	private String userResidenceFoodMenuId;

	private PriceDto prices;

	private FoodItemType foodPreference;

	private Float orderRating;

	private boolean collectionAllowed;

	private List<ItemCostResponseDto> items;

}
