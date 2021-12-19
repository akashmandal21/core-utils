package com.stanzaliving.food.v2.dispatch;

import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderSummaryDto {

	private String residenceId;

	private String dealId;

	private DealCategory dealCategory;

	private String vendorId;

	private FoodServeType foodServeType;

	private MealType mealType;

	private List<BuffetItemDetailsDto> buffetItemDetailsDtoList;

	private List<PackedItemDetailsDto> packedItemDetailsDtoList;

	private List<ThaliPaxDto> thaliPaxDtoList;



}
