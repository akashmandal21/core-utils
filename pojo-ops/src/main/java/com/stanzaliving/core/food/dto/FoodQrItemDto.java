/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FoodQrItemDto {

	private int quantity;
	private double cost;
	private String houseName;
	private String mealType;
	private String foodItemType;
	private FoodItemType foodPreference;
	private String residenceFoodMenuId;
	private String foodText;
	private List<String> foodItemNames;
}
