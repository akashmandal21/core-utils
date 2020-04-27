/**
 * 
 */
package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 23-Apr-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDto {

	private String itemId;

	private String itemName;

	private FoodItemType itemType;

	private String itemTypeName;

	private boolean quantifiable;

	private String textColor;

	private String bgColor;

	private Float rating;

	private Double cost;
	
	private boolean newlyAdded;
}