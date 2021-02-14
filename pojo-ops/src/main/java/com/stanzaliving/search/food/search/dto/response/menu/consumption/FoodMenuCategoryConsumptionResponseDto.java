package com.stanzaliving.search.food.search.dto.response.menu.consumption;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 28-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryConsumptionResponseDto {

	private MenuCategoryConsumptionDto menuCategory;

	private List<ResidenceConsumptionDto> residences;
}
