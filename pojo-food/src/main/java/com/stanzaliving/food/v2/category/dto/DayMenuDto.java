package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.food.enums.FoodServeType;
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
public class DayMenuDto {

	private String thaliId;
	private String thaliVariantId;
	private FoodServeType foodServeType;
	private String defaultBeverage;

}
