package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.enums.FoodItemType;

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

	private FoodItemType itemType;

}