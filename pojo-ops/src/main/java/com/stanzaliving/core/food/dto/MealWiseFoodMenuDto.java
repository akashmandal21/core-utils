/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.operations.enums.MealType;

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
public class MealWiseFoodMenuDto implements Serializable {

	private MealType mealType;

	private String mealTypeName;

	private Float mealRating;

	private Double mealCost;

	private Double budgetedCost;

	private List<MenuItemDto> menuItems;
}