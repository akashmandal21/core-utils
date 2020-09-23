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
 * @date 22 Sep, 2020
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMealWisePresentCountDto {

	private String residenceId;

	private MealType mealType;

	private String mealName;

	private int count;
}