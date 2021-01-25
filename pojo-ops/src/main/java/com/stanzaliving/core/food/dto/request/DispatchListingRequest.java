package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DispatchListingRequest {

	@NotNull(message = "Menu date is mandatory")
	private LocalDate menuDate;

	@NotNull(message = "Meal Type is mandatory")
	private MealType mealType;

	private int pageNumber;

	private int pageSize;

	private List<String> residenceIds;
}