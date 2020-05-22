package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.tuple.Pair;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class VasOrderRequestDto {

	@NotNull(message = "Please choose item and quantity.")
	private List<Pair<String, Integer>> itemIdsAndQuantity;
	
	@NotNull(message = "Please add meal type.")
	private MealType mealType;
	
	@NotNull(message = "Please specify residence.")
	private String residenceId;
	
	@NotNull(message = "Please add user.")
	private String userId;
	
	@NotNull(message = "Please select date.")
	private LocalDate menuDate;
	
}
