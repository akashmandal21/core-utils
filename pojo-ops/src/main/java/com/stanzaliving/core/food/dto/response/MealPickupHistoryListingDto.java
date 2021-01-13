/**
 * 
 */
package com.stanzaliving.core.food.dto.response;

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
public class MealPickupHistoryListingDto {

	private MealType mealType;

	private String mealTypeName;

	private boolean foodOrdered;

	private boolean foodReceived;

	private int totalOrders;

	private int pickedOrders;

}