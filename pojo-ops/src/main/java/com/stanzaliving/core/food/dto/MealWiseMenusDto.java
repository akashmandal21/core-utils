/**
 * 
 */
package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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

	private String mealStartTime;

	private String mealEndTime;

	private Double estimatedCost;


}