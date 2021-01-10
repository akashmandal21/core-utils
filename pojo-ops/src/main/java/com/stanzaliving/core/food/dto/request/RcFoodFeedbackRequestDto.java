package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;

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
public class RcFoodFeedbackRequestDto {

	private String residenceFoodMenuId;

	private String userId;

	private String vendorId;

	private MealType meal;
	
	private LocalDate date;

}
