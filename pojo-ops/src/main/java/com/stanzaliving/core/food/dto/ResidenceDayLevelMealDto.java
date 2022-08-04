/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author naveen.kumar
 *
 * @date 11-Aug-2021
 *
 **/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceDayLevelMealDto {

	private LocalDate date;

	private List<ResidenceMealLevelPlanDto> meals;
}