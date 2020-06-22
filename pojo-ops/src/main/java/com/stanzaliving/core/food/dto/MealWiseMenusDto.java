/**
 * 
 */
package com.stanzaliving.core.food.dto;

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
 * @date 19-Jun-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealWiseMenusDto {

	private MealType mealType;

	private String mealTypeName;

	private List<MealFoodMenuDto> menuDtos;
}