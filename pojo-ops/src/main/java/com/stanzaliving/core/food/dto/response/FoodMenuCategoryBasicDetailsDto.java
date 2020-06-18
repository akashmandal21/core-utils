package com.stanzaliving.core.food.dto.response;

import java.util.List;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.MenuType;

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
	
	private String microMarketId;

	private String microMarketName;
	
	private boolean stanzaKitchenCategory;

	private ResidenceBrand residenceBrand;

	private FoodRegion foodRegion;

	private MenuType menuType;

	private List<FoodItemBasePreference> basePreferences;

	private Double foodMargin;
}