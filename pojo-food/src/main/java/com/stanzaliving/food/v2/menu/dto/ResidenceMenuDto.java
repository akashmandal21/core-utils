package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ResidenceMenuDto extends AbstractDto {
	private String menuCategoryId;
	private String residenceId;
	private String dealId;
	private DealCategory dealCategory;
	private LocalDate menuDate;
	private MealType mealType;
	private String mealId;
	private String mealGroupId;
	private String thaliId;
	private String thaliVariant;
	private String vendorId;
	private Double menuCost;
	private boolean skipped;
	private Float menuRating;
	private FoodItemBasePreference basePreference;
	private FoodRegion foodRegion;
	private boolean defaultMenu;
	private String menuGroupId;
	private FoodItemType itemType;
	private String defaultBeverage;
}
