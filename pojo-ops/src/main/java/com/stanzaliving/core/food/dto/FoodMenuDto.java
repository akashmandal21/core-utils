/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalTime;
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
public class FoodMenuDto {

	private MealType meal;

	private LocalTime startTime;

	private LocalTime endTime;

	private Integer sequence;

	private List<FoodMenuItemDto> itemDtos;

}
