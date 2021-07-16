package com.stanzaliving.core.food.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
@NoArgsConstructor
@AllArgsConstructor
public class KitchenOrderMealRequestDto {

	@Min(value = 0, message = "Stanza staff count must be greater than equal to 0")
	@Max(value = 100, message = "Stanza staff count must be less than equal to 100")
	@NotNull(message = "Stanza staff count must be greater than equal to 0")
	private Integer stanzaStaffCount;

	@Min(value = 0, message = "Non stanza staff count must be greater than equal to 0")
	@Max(value = 100, message = "Non stanza staff count must be less than equal to 100")
	@NotNull(message = "Non stanza staff count must be greater than equal to 0")
	private Integer nonStanzaStaffCount;

	@Min(value = 0, message = "SL Employee Special Meals count must be greater than equal to 0")
	@Max(value = 500, message = "SL Employee Special Meals count must be less than equal to 500")
	@NotNull(message = "SL Employee Special Meals count must be greater than equal to 0")
	private Integer stanzaEmployeeSpecialCount;

	@Min(value = 0, message = "Non-SL Agency count must be greater than equal to 0")
	@Max(value = 500, message = "Non-SL Agency count must be less than equal to 500")
	@NotNull(message = "Non-SL Agency count must be greater than equal to 0")
	private Integer nonStanzaAgencyCount;

	@NotNull(message = "Meal Type cannot be null")
	private MealType mealType;

}