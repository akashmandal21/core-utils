package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceFoodMenuFeedbackDto extends AbstractDto {

	private String residenceId;

	private LocalDate menuDate;

	private MealType mealType;

	private String vendorId;

	private Double menuCost;

	private boolean skipped;

	private Float menuRating;

	private ResidentFoodFeedbackDto residentfeedbackDto;
}
