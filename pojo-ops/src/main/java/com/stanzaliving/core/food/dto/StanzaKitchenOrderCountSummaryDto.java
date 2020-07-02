package com.stanzaliving.core.food.dto;

import java.util.List;

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
public class StanzaKitchenOrderCountSummaryDto {

	private String mealName;

	private String vegCount;

	private String nonVegCount;

	private String staffCount;

	private List<ItemQuantityDto> vegItemQuantities;

	private List<ItemQuantityDto> specialVegItemQuantities;

	private List<ItemQuantityDto> nonVegItemQuantities;

}
