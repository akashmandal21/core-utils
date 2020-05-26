package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.enums.FoodRegion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FoodMenuCategoryBasicDetailsDto {
	
	private String uuid;
	
	private String cityId;
	
	private String cityName;

	private String categoryName;

	private boolean stanzaKitchenCategory;

	private ResidenceBrand residenceBrand;

	private FoodRegion foodRegion;
}
