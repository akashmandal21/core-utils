package com.stanzaliving.core.operations.dto.report.food;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MealDto {

	private double overall;

	private double breakfast;

	private double lunch;

	private double snacks;

	private double dinner;

	private double brunch;

}