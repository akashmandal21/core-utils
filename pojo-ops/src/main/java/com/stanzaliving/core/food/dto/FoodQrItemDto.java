/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

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

	private String houseName;
	private String mealType;
	private String foodItemType;
	private Long menuDate;
	private List<String> foodItemNames;
}
