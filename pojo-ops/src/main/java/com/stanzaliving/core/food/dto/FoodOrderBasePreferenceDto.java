package com.stanzaliving.core.food.dto;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.stanzaliving.core.food.dto.request.AdditionalItemsRequestDto;
import com.stanzaliving.core.food.dto.response.OrderItemGrammageDto;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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

	private FoodServeType serveType;

	private List<AdditionalItemsRequestDto> additionalItemsDtos;

	@Builder.Default
	private List<OrderItemGrammageDto> buffetItems = new ArrayList<>();
	
	private String thaliId;

	private String thaliVariant;

	private String thaliName;

	private Integer vegPax;

	private Integer nonVegPax;
	
	@Builder.Default
	private Collection<UserBeveragePreferenceCountDto> userBeveragePreferenceCountDtos = new ArrayList<>();
}