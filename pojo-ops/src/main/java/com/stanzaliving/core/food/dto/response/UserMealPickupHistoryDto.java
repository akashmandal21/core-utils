/**
 * 
 */
package com.stanzaliving.core.food.dto.response;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 13-Jan-2021
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserMealPickupHistoryDto {

	private MealType mealType;

	private String mealTypeName;

	private LocalDate menuDate;

	private long received;

	private long picked;
	
	private long pending;
	
	private List<UserMealOrderDto> userMealOrderDtos;

}