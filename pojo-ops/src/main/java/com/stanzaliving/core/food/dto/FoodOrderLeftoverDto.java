package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotEmpty;

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
public class FoodOrderLeftoverDto {

	private MealType meal;

	private LocalDate date;

	private String orderId;
	
	@Builder.Default
	private Integer studentCount=0;

	@NotEmpty(message = "item leftover can not be empty")
	private List<FoodOrderItemLeftoverDto> foodOrderItemLeftoverDtos;

}
