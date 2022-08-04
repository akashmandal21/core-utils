package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.food.v2.common.dto.MealDto;
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
public class MenuCategoryMealDto extends MealDto {

	private static final long serialVersionUID = 1777854348475903595L;

	private boolean enabled;
	private boolean monday;
	private boolean tuesday;
	private boolean wednesday;
	private boolean thursday;
	private boolean friday;
	private boolean saturday;
	private boolean sunday;

	private Double packagingCost;
	private Double vegCogs;
	private Double nonVegCogs;
	private Double externalStaffCogs;
	private Double optInPercentage;

	private Double mealCost;
	private Double trueCost;

	private Double nonVegMealCost;
	private Double nonVegTrueCost;

	private Double fnbMealCost;
	private Double fnbTrueCost;

	private Double nonVegFnbMealCost;
	private Double nonVegFnbTrueCost;

	private int activeDays;
}
