package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
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
public class FoodPreferenceComboItemDto {

	private String itemName;

	private Integer stdQty;

	private Integer stdWeight;

	private ListingDto units;

	private FoodItemType itemType;
	
	private boolean quantifiable;

	private boolean hideGrammage;

}