package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava
 *
 * @date 23-July-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealCostTimingDto {
	private Double veg;

	private Double nonVeg;

	private Double nonSL;

	private String startTime;

	private String endTime;

	private boolean isVegChanged;

	private boolean isNonVegChanged;

	private boolean isNonSLChanged;

	private boolean isStartTimingChanged;

	private boolean isEndTimingChanged;
}
