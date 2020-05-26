package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class DispatchListingRequest {

	@NotNull(message = "Please provide menu date")
	private LocalDate menuDate;
	
	private String residenceId;
	
	private MealType mealType;
	
	private int pageNumber;
	
	private int pageSize;
}
