package com.stanzaliving.core.food.dto;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.food.dto.response.IngredientPriceDto;

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
public class FoodItemRecipeCostRequestDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String itemId;
	private LocalDate costDate;
	private Map<String, Map<String, List<IngredientPriceDto>>> ingredientVendorPriceMap;
    
}
