/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class FoodQrItemDto {

	private String houseName;
	private String mealType;
	private String foodItemType;
	private Long menuDate;
	private List<String> foodItemNames;
}
