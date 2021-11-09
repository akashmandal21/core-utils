package com.stanzaliving.search.food.search.dto.response.menu.fps;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 28-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MicromarketMealFpsDto extends MealFpsDto {
	private String micromarketId;
	
	public MicromarketMealFpsDto(MealFpsDto mealFpsDto) {
		this.setMealType(mealFpsDto.getMealType());
		this.setDelightedCount(mealFpsDto.getDelightedCount());
		this.setDisgustedCount(mealFpsDto.getDisgustedCount());
		this.setTotalRatingCount(mealFpsDto.getTotalRatingCount());
		this.setFpsPercent(mealFpsDto.getFpsPercent());
	}
}
