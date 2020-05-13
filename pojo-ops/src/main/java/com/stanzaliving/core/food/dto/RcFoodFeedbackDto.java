package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class RcFoodFeedbackDto {

	private String residenceFoodMenuId;

	@Builder.Default
	private Float taste = 0f;

	@Builder.Default
	private Float quality = 0f;

	@Builder.Default
	private Float presentation = 0f;

	private String comment;

	@Builder.Default
	private Boolean shortage = false;

	@Builder.Default
	private Boolean leftover = false;

	@Builder.Default
	private Boolean foreignParticle = false;
	
	private String vendorId;
	
	private MealType meal;
	
	private LocalDate date;
	
	private String userId;
	
}
