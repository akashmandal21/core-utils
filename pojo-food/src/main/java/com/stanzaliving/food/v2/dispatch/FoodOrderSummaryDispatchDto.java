package com.stanzaliving.food.v2.dispatch;

import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.food.v2.common.constant.PackageLocationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderSummaryDispatchDto {

	private String residenceId;

	private String dealId;

	private DealCategory dealCategory;

	private String vendorId;

	@Builder.Default
	private boolean stanzaKitchen = false;

	private String foodOrderId;

	private String menuCategoryId;

	private String menuCategoryName;

	private String shortCode;

	private String menuCategoryVersionId;

	private LocalDate menuDate;

	private FoodServeType foodServeType;

	private FoodServeType itemFoodServeType;

	private PackageLocationType packageLocationType;

	private MealType mealType;

	private LocalTime mealStartTime;

	private LocalTime mealEndTime;

	private List<ItemDetailsDto> buffetItemDetailsDtoList;

	private List<ItemDetailsDto> packedItemDetailsDtoList;

	private List<ThaliPaxDto> thaliPaxDtoList;

}
