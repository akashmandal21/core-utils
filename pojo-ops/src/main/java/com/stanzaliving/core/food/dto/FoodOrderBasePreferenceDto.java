package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.dto.request.AdditionalItemsRequestDto;
import com.stanzaliving.core.food.dto.request.OrderItemGrammageDto;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderBasePreferenceDto {

	private String residenceFoodMenuId;

	private String vendorId;

	private String vendorName;

	private FoodItemBasePreference basePreference;

	private String basePreferenceName;

	private FoodRegion region;

	private String regionName;

	private String combo;

	private String comboName;

	private boolean defaultMenu;

	private LocalTime mealStartTime;

	private LocalTime mealEndTime;

	private boolean hybrid;

	private List<AdditionalItemsRequestDto> additionalItemsDtos;

	private List<OrderItemGrammageDto> buffetItems;
	
	private String thaliId;

	private String thaliVariant;

	private String thaliName;

	private Integer vegPax;

	private Integer nonVegPax;
}