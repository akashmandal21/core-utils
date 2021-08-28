package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;
import java.util.Collection;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 * @date 28-AUG-2021
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemGetRequestDto {
	
	private Collection<String> itemIds;
	private Collection<FoodItemType> itemTypes;
	private LocalDate priceAt;

}