package com.stanzaliving.core.food.dto.response;

import java.util.List;

import com.stanzaliving.core.food.dto.request.FoodMenuCategoryMealDto;
import com.stanzaliving.core.food.enums.MenuType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava
 *
 * @date 09-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryResponseDto {

	private String menuCategoryId;
	
	private boolean stanzaKitchen;

	private String city;

	private String cityId;

	private String microMarket;

	private String microMarketId;

	private String category;

	private Double targetPrice;

	private String targetPriceUnit;

	private boolean published;
	
	private boolean skeletalRuleVerified;

	private boolean sampleMenu;

	private boolean grammage;

	private Long residenceCount;

	private boolean dataComplete;

	private boolean draftAvailable;
	
	private MenuType menuType;

	private List<FoodMenuCategoryMealDto> applicableMeals;

}