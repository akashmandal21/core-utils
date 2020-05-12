package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.request.FoodMenuCategoryMealDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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

	private String city;

	private String category;

	private Double targetPrice;

	private String targetPriceUnit;

	private List<FoodMenuCategoryMealDto> applicableMeals;

	private boolean skeletalRuleVerified;

	private boolean sampleMenu;

	private boolean grammage;

	private Long residenceCount;

}
