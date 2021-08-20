package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealDateDto {

	private MealType mealType;
	
	private LocalDate localDate;

}
