package com.stanzaliving.core.food.dto.response;

import java.util.List;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stazaliving.com"
 *
 * @date 14-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodVendorCategoryResponseDto {

	private String categoryName;

	private boolean status;

	private boolean pricing;

	private long residenceCount;

	private List<VendorMealCostDto> mealCostDtos;
}