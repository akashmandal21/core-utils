package com.stanzaliving.core.food.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

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

	private LocalTime startTime;

	private LocalTime endTime;

	private boolean isVegChanged;

	private boolean isNonVegChanged;

	private boolean isNonSLChanged;

	private boolean isStartTimingChanged;

	private boolean isEndTimingChanged;
}
